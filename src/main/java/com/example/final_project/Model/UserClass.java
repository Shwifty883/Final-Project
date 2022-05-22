package com.example.final_project.Model;

public class UserClass {
    private String name;
    private String surname;
    private String userName;
    private String password;
    private String profession;

    public UserClass(String name, String surname, String userName, String password, String profession) {
        this.name = name;
        this.surname = surname;
        this.userName = userName;
        this.password = password;
        this.profession = profession;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
