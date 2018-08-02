package com.practise.chainofresponsibility;

public class Cutomer {
    private String name;
    private String occupation;
    private String mail;

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getMail() {
        return mail;
    }
}

