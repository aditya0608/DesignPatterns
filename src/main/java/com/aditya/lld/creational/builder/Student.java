package com.aditya.lld.creational.builder;
 public class Student
{
    private String fName;
    private String lName;
    private String phoneNo;
    private String emailId;
    private String address;
    private Student(StudentBuilder studentBuilder)
    {
        this.fName=studentBuilder.fName;
        //rest all fields
    }
    static class StudentBuilder
    {
        private String fName;
        private String lName;
        private String phoneNo;
        private String emailId;
        private String address;
        public Student StudentBuilder() throws Exception {
            if(validate())
            {
                StudentBuilder studentBuilder=new StudentBuilder();
                studentBuilder.fName=fName;
                studentBuilder.lName=lName;
                studentBuilder.emailId=emailId;
                studentBuilder.phoneNo=phoneNo;
                studentBuilder.address=address;
                Student student=build();
                return student;
            }
            else {
                System.out.println(fName+ lName);

                throw new Exception();
            }
        }
        public boolean validate()
        {
            if(fName!=null && lName!=null)
                return true;
            return false;
        }
        public Student build()
        {
            new Student(this);
            return student;
        }
        public StudentBuilder withName(String fName,String lName)
        {
            this.fName=fName;
            this.lName=lName;
            return this;
        }
        public StudentBuilder withContact(String emailId,String address,String phoneNo)
        {
            this.emailId=emailId;
            this.phoneNo=phoneNo;
            this.address=address;
            return this;
        }
    }
}