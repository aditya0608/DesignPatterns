package com.aditya.lld.creational.builder;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BadDesignTest {

    @Test
    public void testBadDesign()
    {
        BadDesign badDesign=new BadDesign();
        badDesign.setfName("ADITYA").setlName("SHARMA");
        assertEquals("If name is set ","ADITYA",badDesign.getfName());
    }
}
