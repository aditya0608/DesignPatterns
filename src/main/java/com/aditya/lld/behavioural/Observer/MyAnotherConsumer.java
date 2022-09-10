package com.aditya.lld.behavioural.Observer;

public class MyAnotherConsumer implements  MessageListener{
    public  static String name="MY_ANOTHER_CONSUMER";
    @Override
    public void onMessage(String message) {
        System.out.println("Message received in "+ name+" "+message);
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyAnotherConsumer.name = name;
    }
}
