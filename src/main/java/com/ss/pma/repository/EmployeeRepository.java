package com.ss.pma.repository;

import com.ss.pma.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
