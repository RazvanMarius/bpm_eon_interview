drop table user_tab;
drop table forms_tab;
drop table team_info_tab;
create table user_tab(
	user_id int not null default 0,
	team_id int not null default 0,
	name VARCHAR(120), 
	user_type varchar(20),
	primary key(user_id)
);
--
create table forms_tab(
	user_name varchar(120) not null default '',
	start_dt date not null,
	end_dt date not null,
	text_comment varchar(250),
	form_status varchar(20),
	primary key (user_name, start_dt, end_dt)
);
--
create table team_info_tab(
	team_id int not null default 0,
	name varchar(120),
	primary key(team_id)
);
insert into user_tab values(1001, 1001, 'Razvan', 'employee');
insert into user_tab values(1002, 1001, 'Marius', 'employee');
insert into user_tab values(1003, 1001, 'HR One', 'hr');
insert into user_tab values(1004, 1002, 'Employee One', 'employee');
insert into user_tab values(1005, 1002, 'Hr Two', 'hr');
insert into user_tab values(1006, 1003, 'Employee Two', 'employee');
--
insert into team_info_tab values(1001, 'Developers');
insert into team_info_tab values(1002, 'Analysts');
insert into team_info_tab values(1003, 'Managers');
--
insert into forms_tab values('Razvan', '2022-01-01', '2022-01-15', 'covid', 'Pending');
insert into forms_tab values('Razvan', '2022-02-01', '2022-02-15', 'covid again', 'Pending');
insert into forms_tab values('Razvan', '2022-04-01', '2022-04-15', 'covid', 'Pending');
insert into forms_tab values('Razvan', '2022-03-01', '2022-01-05', 'flu', 'Pending');
insert into forms_tab values('Razvan', '2022-03-10', '2022-03-15', '', 'Pending');
insert into forms_tab values('Employee Two', '2021-01-01', '2021-01-15', '', 'Pending');
insert into forms_tab values('Employee Two', '2022-03-01', '2022-01-05', 'flu', 'Pending');
insert into forms_tab values('Razvan', '2022-03-15', '2022-03-15', 'head ache', 'Pending');
insert into forms_tab values('Employee One', '2022-02-01', '2022-03-01', 'broken leg', 'Pending');
insert into forms_tab values('Employee One', '2022-04-01', '2022-04-02', 'blood work', 'Pending');
insert into forms_tab values('Employee Two', '2022-04-01', '2022-04-15', '', 'Pending');