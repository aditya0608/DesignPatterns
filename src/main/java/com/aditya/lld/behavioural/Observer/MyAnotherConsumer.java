package com.aditya.lld.behavioural.Observer;

public class MyAnotherConsumer implements  MessageListener{
    @Override
    public void onMessage(String message) {
        System.out.println("My Another consumer "+ message);
    }
}
