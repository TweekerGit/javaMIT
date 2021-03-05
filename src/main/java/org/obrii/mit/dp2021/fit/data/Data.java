package org.obrii.mit.dp2021.fit.data;

public class Data {
    private int Id;
    private String Name;
    private int Age;
    private String Mail;

    public Data(int id, String name, int age, String mail) {
        Id = id;
        Name = name;
        Age = age;
        Mail = mail;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }
}
