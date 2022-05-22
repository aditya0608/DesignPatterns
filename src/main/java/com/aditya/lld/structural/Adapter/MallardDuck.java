package com.aditya.lld.structural.Adapter;

public class MallardDuck implements  Duck{

    @Override
    public void fly() {
        System.out.println("Duck flying");
    }

    @Override
    public void eat() {
        System.out.println("Duck eating ");

    }
}
