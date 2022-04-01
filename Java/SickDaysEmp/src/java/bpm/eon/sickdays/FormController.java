package bpm.eon.sickdays;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class FormController {

    private ArrayList<Form> forms;
    private int teamId;

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    private final FormDbUtil formDbUtil;
    private final Logger logger = Logger.getLogger(getClass().getName());

    public FormController() throws Exception {
        forms = new ArrayList<>();
        formDbUtil = FormDbUtil.getInstance();
    }

    public List<Form> getForms() {
        return forms;
    }

    public String loadForms() {
        logger.info("Loading forms");
        forms.clear();
        try {
            forms = formDbUtil.getForms();
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> requestMap = externalContext.getRequestMap();
            requestMap.put("listOfForms", new ListOfForms(forms));
        } catch (Exception exc) {
            logger.log(Level.SEVERE, "Error loading students", exc);
            addErrorMessage(exc);
        }
        return "formHr";
    }
    
    public String loadForms(String name) {
        logger.info("Loading forms");
        forms.clear();
        try {
            forms = formDbUtil.getForms(name);
            ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
            Map<String, Object> requestMap = externalContext.getRequestMap();
            requestMap.put("hrName", new HrName(name));
        } catch (Exception exc) {
            logger.log(Level.SEVERE, "Error loading students", exc);
            addErrorMessage(exc);
        }
        return "formHr";
    }

    public void addForm(Form form) {
        formDbUtil.addForm(form);
    }

    public void approveForm(Form form) {
        formDbUtil.approveForm(form);
    }

    public void rejectForm(Form form) {
        formDbUtil.rejectForm(form);
    }

    private void addErrorMessage(Exception exc) {
        FacesMessage message = new FacesMessage("Error: " + exc.getMessage());
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
