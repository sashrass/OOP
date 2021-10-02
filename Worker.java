package com.Rassokhin_OOP;

public abstract class Worker {

    public int id;
    private int pointNumber;
    private String phoneNumber;
    private String name;
    private String email;

    public Worker(int iD, int pointNum, String phoneNum,  String workerName, String workerEmail)
    {
        id = iD;
        pointNumber = pointNum;
        phoneNumber = phoneNum;
        name = workerName;
        email = workerEmail;
    }

    public void changeID(int iD)
    {
        id = iD;
    }

    public void changePointNumber(int pointNum)
    {
        pointNumber = pointNum;
    }

    public void changePhoneNUmber(String phoneNum)
    {
        phoneNumber = phoneNum;
    }

    public void changeName(String workerName)
    {
        name = workerName;
    }

    public void changeEmail(String workerEmail)
    {
        email = workerEmail;
    }

    String getInfo()
    {
        return "Name: " + name + "\nid: " + id + "\nPointNumber: " + pointNumber + "\nPhoneNumber" + phoneNumber +"\nEmail: " + email +"\n";
    }





}



