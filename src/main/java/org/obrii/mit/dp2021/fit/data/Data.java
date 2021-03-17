package org.obrii.mit.dp2021.fit.data;

import java.io.Serializable;

public class Data implements Serializable{

    private int id;
    private String firstName;
    private String lastName;
    private String phone;
    private String date;

    public Data() {
    }

    public Data(int id, String firstName, String lastName, String phone, String date) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.date = date;
    }

    public Data(String firstName, String lastName, String phone, String date) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.date = date;
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

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Data{" + "id = " + id + ", firstName = " + firstName + ", lastName = " + lastName + ", phone = " + phone + ", date = " + date + '}';
    }
}
