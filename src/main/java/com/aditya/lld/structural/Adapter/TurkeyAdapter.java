package com.aditya.lld.structural.Adapter;

public class TurkeyAdapter implements  Duck{

    Turkey turkey;
    TurkeyAdapter(Turkey turkey)
    {
        this.turkey=turkey;
    }
    @Override
    public void fly() {
        System.out.println("Flying fast like a duck");
    }

    @Override
    public void eat() {
        System.out.println("Eating like a duck now ");

    }
}
