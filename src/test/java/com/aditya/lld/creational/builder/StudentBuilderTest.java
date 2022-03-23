package com.aditya.lld.creational.builder;

import org.junit.*;
import static org.junit.Assert.assertEquals;

public class StudentBuilderTest {
    @Test
    public void studentTest()
    {
        Student student=new Student.StudentBuilder()
        .withContact("abc@gmail.com","h342 goa","000000")
        .withName("ADITYA","SHARMA").build();
        assertEquals("if name is set it should return ADITYA","ADITYA",student.getfName());
    }
    @Test(expected = IllegalArgumentException.class)
    public void studentTestValidations()
    {
        Student studentBuilder=new Student.StudentBuilder()
        .withContact("abc@gmail.com","h342 goa","000000").build();
    }
}
