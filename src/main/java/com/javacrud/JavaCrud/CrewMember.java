package com.javacrud.JavaCrud;

import org.springframework.web.bind.annotation.RestController;


@RestController

public class CrewMember {
    public Long salary;
    public String name;
    public String job;

    public String getJob() {
        return job;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    public void setJob(String job) {
        this.job = job;
    }

}
