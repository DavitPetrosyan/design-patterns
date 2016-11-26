package com.companyname.designpatterns.behavioral.observer.impl;

import com.companyname.designpatterns.behavioral.observer.interfaces.Observer;

/**
 * Created by davitpetrosyan on 9/15/16.
 */
public class ObserverImpl implements Observer {
    @Override
    public void update(String name) {
        System.out.println("Davit is already 25 !!!");
    }
}
