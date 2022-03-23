package com.aditya.lld.creational.builder;

public class Student {

     private String fName;
     private String lName;
     private String emailId;
     private String address;
     private String phoneNumber;
     //getters
     public String getfName() {
         return fName;
     }

    public String getlName() {
        return lName;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


    //Create an inner class with same fields
    public static class StudentBuilder
    {
        private String fName;
        private String lName;
        private String emailId;
        private String address;
        private String phoneNumber;



        public Student build()
        {
            //before returning the object of student validate it

            if(validate()) {
                Student student = new Student();
                student.address = address;
                student.fName = fName;
                student.lName = lName;
                student.emailId = emailId;
                student.phoneNumber = phoneNumber;
                return student;
            }
            else
                throw new IllegalArgumentException("Enter the name dude...");
        }
        public boolean validate( )
        {
            if(fName==null || lName==null)
            return false;
            return true;

        }
        public StudentBuilder withName(String fName,String lName)
        {
            this.fName=fName;
            this.lName=lName;
            return this;
        }
        public StudentBuilder withContact(String emailId,String address,String phoneNumber)
        {
            this.address=address;
            this.emailId=emailId;
            this.phoneNumber=phoneNumber;
            return this;
        }


    }
}
