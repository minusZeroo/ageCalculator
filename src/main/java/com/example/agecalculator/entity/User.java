package com.example.agecalculator.entity;

import java.util.Date;

public class User {

    private String name;
    private String surname;
    private Integer currentAge;
    private Date dateOfBirth;

    public User() {
    }

    public User(String name, String surname, Integer currentAge, Date dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.currentAge = currentAge;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getCurrentAge() {
        return currentAge;
    }

    public void setCurrentAge(Integer currentAge) {
        this.currentAge = currentAge;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", currentAge=" + currentAge +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
