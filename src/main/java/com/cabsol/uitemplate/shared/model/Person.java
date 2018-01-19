package com.cabsol.uitemplate.shared.model;

import gwt.material.design.client.data.HasDataCategory;

import java.io.Serializable;
import java.util.Objects;

public class Person implements HasDataCategory, Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String category;

    private Person(){}

    public Person(int id, String firstName, String lastName, String phone, String category) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, phone);
    }

    @Override
    public String getDataCategory() {
        return getCategory();
    }
}
