package com.aditya.lld.behavioural.Observer;

public class Runner {

    public static void main(String[] args) {
        MBroker broker=new IbmMq();
        broker.addListener(new MyConsumer());
        broker.addListener(new MyAnotherConsumer());
        broker.pushMessage();

    }
}
