package com.aditya.lld.behavioural.Observer;

public class MyConsumer implements  MessageListener{

    private static String name;
    public MyConsumer(){
        name="MY_CONSUMER";
    }
    @Override
    public void onMessage(String message) {
        System.out.println("Message received in "+ name+" "+message);

    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        MyConsumer.name = name;
    }
}
