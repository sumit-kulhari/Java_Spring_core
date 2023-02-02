package com.bhavana.beans;

import java.util.List;

public class EmployeeCollection {
    private int eid;
    private String name;
    private int salary;

    private List<String> Language;

    public List<String> getLanguage() {
        return Language;
    }

    public void setLanguage(List<String> language) {
        Language = language;
    }

    public EmployeeCollection() {
    }

    @Override
    public String toString() {
        return "EmployeeCollection{" +
                "eid=" + eid +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", Language=" + Language +
                '}';
    }

    public EmployeeCollection(int eid, String name, int salary, List<String> Language) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
        this.Language = Language;
    }
    

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
