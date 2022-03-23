package com.aditya.lld.creational.builder;

public class BadDesign {

    //To be solved
    //1. handle number of fields
    //2. validations
    //3. Immutability
    private String fName;
    private String lName;
    private String rollNo;
    private String age;
    private String admNo;

    //put mandate fields in constructor


    public BadDesign() {
    }

    public BadDesign(String fName, String LName, String admNo) {
        this.fName = fName;
        this.lName = LName;
        this.admNo = admNo;
    }
    //  In setter return this to continue setting to the same chain
    public BadDesign setfName(String fName)
    {
        this.fName=fName;
        return this;
    }
    public String getfName()
    {
        return this.fName;
    }

    public BadDesign setlName(String lName)
    {
        this.lName=lName;
        return this;
    }
    public String getlName()
    {
        return this.lName;
    }

    //add pending getters and setters

}
