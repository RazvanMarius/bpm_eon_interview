package bpm.eon.sickdays;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class FormDbUtil {

    private static FormDbUtil instance;
    private final DataSource dataSource;
    private final String jndiName = "java:comp/env/jdbc/sickDaysData";

    public static FormDbUtil getInstance() throws Exception {
        if (instance == null) {
            instance = new FormDbUtil();
        }
        return instance;
    }

    private FormDbUtil() throws Exception {
        dataSource = getDataSource();
    }

    private DataSource getDataSource() throws NamingException {
        Context context = new InitialContext();
        DataSource theDataSource = (DataSource) context.lookup(jndiName);
        return theDataSource;
    }

    public ArrayList<Form> getForms() {
        ArrayList<Form> forms = new ArrayList<>();
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        try {
            myConn = getConnection();
            String sql = "SELECT * from forms_tab";
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery(sql);
            while (myRs.next()) {
                String userName = myRs.getString("user_name");
                String startDate = myRs.getString("start_dt");
                String endDate = myRs.getString("end_dt");
                String comment = myRs.getString("text_comment");
                String status = myRs.getString("form_status");
                Form temptForm = new Form(userName, startDate, endDate, comment, status);
                forms.add(temptForm);
            }
        } catch (SQLException ex) {
            System.out.println("SQL error: " + ex.getMessage());
        } finally {
            close(myConn, myStmt, myRs);
        }
        return forms;
    }
    
    public ArrayList<Form> getForms(String name) {
        ArrayList<Form> forms = new ArrayList<>();
        Connection myConn = null;
        Statement myStmt = null;
        ResultSet myRs = null;
        try {
            myConn = getConnection();
            String sql = "SELECT * from forms_tab where user_name in (select name from user_tab where team_id = (select team_id from user_tab where name = " + name + "))";
            myStmt = myConn.createStatement();
            myRs = myStmt.executeQuery(sql);
            while (myRs.next()) {
                String userName = myRs.getString("user_name");
                String startDate = myRs.getString("start_dt");
                String endDate = myRs.getString("end_dt");
                String comment = myRs.getString("text_comment");
                String status = myRs.getString("form_status");
                Form temptForm = new Form(userName, startDate, endDate, comment, status);
                forms.add(temptForm);
            }
        } catch (SQLException ex) {
            System.out.println("SQL error: " + ex.getMessage());
        } finally {
            close(myConn, myStmt, myRs);
        }
        return forms;
    }

    public void addForm(Form theForm) {
        Connection myConn = null;
        PreparedStatement myStmt = null;
        try {
            myConn = getConnection();
            String sql = "insert into forms_tab (user_name, start_dt, end_dt, text_comment, form_status) values (?, ?, ?, ?, ?)";
            myStmt = myConn.prepareStatement(sql);
            // set params
            myStmt.setString(1, theForm.getName());
            myStmt.setString(2, theForm.getStartDate());
            myStmt.setString(3, theForm.getEndDate());
            myStmt.setString(4, theForm.getComment());
            myStmt.setString(5, theForm.getStatus());
            myStmt.execute();
        } catch (SQLException ex) {
            System.out.println("SQL error: " + ex.getMessage());
        } finally {
            close(myConn, myStmt);
        }
    }

    public void approveForm(Form theForm) {
        Connection myConn = null;
        PreparedStatement myStmt = null;
        try {
            myConn = getConnection();
            String sql = "update forms_tab set form_status='Approved' where user_name=? and start_dt=? and end_dt=?";
            myStmt = myConn.prepareStatement(sql);
            // set params
            myStmt.setString(1, theForm.getName());
            myStmt.setString(2, theForm.getStartDate());
            myStmt.setString(3, theForm.getEndDate());
            myStmt.execute();
        } catch (SQLException ex) {
            System.out.println("SQL error " + ex.getMessage());
        } finally {
            close(myConn, myStmt);
        }
    }

    public void rejectForm(Form theForm) {
        Connection myConn = null;
        PreparedStatement myStmt = null;
        try {
            myConn = getConnection();
            String sql = "update forms_tab set form_status='Rejected' where user_name=? and start_dt=? and end_dt=?";
            myStmt = myConn.prepareStatement(sql);
            // set params
            myStmt.setString(1, theForm.getName());
            myStmt.setString(2, theForm.getStartDate());
            myStmt.setString(3, theForm.getEndDate());
            myStmt.execute();
        } catch (SQLException ex) {
            System.out.println("SQL error " + ex.getMessage());
        } finally {
            close(myConn, myStmt);
        }
    }

    private Connection getConnection() {
        Connection theConn = null;
        try {
            theConn = dataSource.getConnection();
        } catch (SQLException ex) {
            System.out.println("Connection error " + ex.getMessage());
        }
        return theConn;
    }

    private void close(Connection theConn, Statement theStmt) {
        close(theConn, theStmt, null);
    }

    private void close(Connection theConn, Statement theStmt, ResultSet theRs) {
        try {
            if (theRs != null) {
                theRs.close();
            }
            if (theStmt != null) {
                theStmt.close();
            }
            if (theConn != null) {
                theConn.close();
            }
        } catch (SQLException exc) {
        }
    }
}
