
insert into employee (firstname, lastname, email) values ('John', 'Warton', 'warton@gmail.com');
insert into employee (firstname, lastname, email) values ( 'Mike', 'Lanister', 'lanister@gmail.com');
insert into employee (firstname, lastname, email) values ('Steve', 'Reeves', 'Reeves@gmail.com');
insert into employee (firstname, lastname, email) values ('Ronald', 'Connor', 'connor@gmail.com');
insert into employee (firstname, lastname, email) values ('Jim', 'Salvator', 'Sal@gmail.com');
insert into employee (firstname, lastname, email) values ('Peter', 'Henley', 'henley@gmail.com');
insert into employee (firstname, lastname, email) values ('Richard', 'Carson', 'carson@gmail.com');
insert into employee (firstname, lastname, email) values ('Honor', 'Miles', 'miles@gmail.com');
insert into employee (firstname, lastname, email) values ('Tony', 'Roggers', 'roggers@gmail.com');

-- INSERT PROJECTS
insert into project (name, stage, description) values ('Large Production Deploy', 'NOTSTARTED', 'This requires all hands on deck for the final deployment of the software into production');
insert into project (name, stage, description) values ('New Employee Budget',  'COMPLETED', 'Decide on a new employee bonus budget for the year and figureout who will be promoted');
insert into project (name, stage, description) values ('Office Reconstruction', 'INPROGRESS', 'The office building in Monroe has been damaged due to hurricane in the region. This needs to be reconstructed');
insert into project (name, stage, description) values ('Improve Intranet Security', 'INPROGRESS', 'With the recent data hack, the office security needs to be improved and proper security team needs to be hired for implementation');

-- INSERT PROJECT_EMPLOYEE_RELATION (Removed duplicates from video)
insert into project_employee (employee_id, project_id) values (1,1);
insert into project_employee (employee_id, project_id) values (1,2);
insert into project_employee (employee_id, project_id) values (1,3);
insert into project_employee (employee_id, project_id) values (3,1);
insert into project_employee (employee_id, project_id) values (6,3);
insert into project_employee (employee_id, project_id) values (6,4);
