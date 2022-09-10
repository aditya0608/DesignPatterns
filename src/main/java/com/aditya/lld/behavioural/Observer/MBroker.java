package com.aditya.lld.behavioural.Observer;

public interface MBroker {

    public void pushMessage();
    public void addListener(MessageListener listener);
    public void removeListener(MessageListener listener);
}
