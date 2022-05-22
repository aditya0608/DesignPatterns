package com.aditya.lld.structural.Adapter;

public class WildTurkey implements  Turkey{
    @Override
    public void fly() {
        System.out.println("Turkey flying ");
    }

    @Override
    public void eat() {
        System.out.println("Turkey eating ");

    }
}
