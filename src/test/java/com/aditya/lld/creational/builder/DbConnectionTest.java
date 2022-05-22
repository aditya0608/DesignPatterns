package com.aditya.lld.creational.builder;

import com.aditya.lld.creational.Singleton.DbConnection;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class DbConnectionTest {

    @Test
    public void testDbconnectionObject()
    {
        DbConnection dbConnection = DbConnection.getInstance();
        DbConnection dbConnection2 = DbConnection.getInstance();

        assertTrue("If two objects are same ",dbConnection==dbConnection2);




    }
}
