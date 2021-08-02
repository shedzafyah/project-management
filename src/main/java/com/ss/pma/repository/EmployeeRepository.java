package com.ss.pma.repository;

import com.ss.pma.domain.*;
import com.ss.pma.dto.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(nativeQuery = true, value = " SELECT e.firstname as firstname, e.lastname as lastname, COUNT(project_id) as project_count FROM employee e left join project_employee pe ON pe.employee_id = e.id GROUP BY e.firstname, e.lastname ORDER BY 3 DESC")
    List<Project> employeeProjects();




}
