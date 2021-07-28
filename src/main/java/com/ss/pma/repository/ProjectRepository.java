package com.ss.pma.repository;

import com.ss.pma.domain.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

import java.util.*;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {

    @Query(nativeQuery = true,value = "SELECT stage as label, COUNT(*) as value FROM project GROUP BY stage;")
    List<Project> listEmployeeProjects();

}
