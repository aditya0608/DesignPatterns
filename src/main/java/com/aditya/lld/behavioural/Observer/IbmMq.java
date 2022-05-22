package com.aditya.lld.behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public class IbmMq implements  MBroker{

    List<MessageListener> list=new ArrayList<>();

    @Override
    public void addListener(MessageListener listener)
    {
        list.add(listener);
    }
    @Override
    public void pushMessage() {

        for(MessageListener s:list)
        {
            s.onMessage("Hello bean ");
        }

    }
}
