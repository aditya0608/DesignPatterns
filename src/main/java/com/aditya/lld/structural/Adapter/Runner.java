package com.aditya.lld.structural.Adapter;

public class Runner {

    public static void main(String[] args) {
        Duck duck=new MallardDuck();
        Duck duck2=new TurkeyAdapter(new WildTurkey());
        duck2.eat();
        duck2.fly();
    }
}
