package com.aditya.lld.creational.Singleton;
public class DbConnection {
    private static  DbConnection dbConnection=null;
    //private constructor does not anyone to instantiate this DbConnenction
    private DbConnection()
    {

    }
    public static DbConnection getInstance()
    {
        //create new instance only if it is null
        //ensures only single object creation
        if(dbConnection==null)
        {
            //synchronised block allows only one connection
            //otherwise two threads can invoke it simultaneously
            synchronized (DbConnection.class)
            {
                dbConnection=new DbConnection();
            }
        }
        return dbConnection;
    }
}
