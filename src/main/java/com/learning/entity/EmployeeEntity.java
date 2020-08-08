package com.learning.entity;

public class EmployeeEntity extends XXBaseEntity{

    private String name;

    public EmployeeEntity(String id, String name) {
        setId(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
