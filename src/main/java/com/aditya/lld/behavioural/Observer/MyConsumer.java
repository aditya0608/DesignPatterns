package com.aditya.lld.behavioural.Observer;

public class MyConsumer implements  MessageListener{

    @Override
    public void onMessage(String messsage) {
        System.out.println("Message received "+ messsage);
    }
}
