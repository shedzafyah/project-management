package com.ss.pma.dto;

public class EmployeeProjectDTO {

    private String firstname;
    private String lastname;
    private String projectCount;

    public EmployeeProjectDTO(String firstname, String lastname, String projectCount) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.projectCount = projectCount;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(String projectCount) {
        this.projectCount = projectCount;
    }
}
