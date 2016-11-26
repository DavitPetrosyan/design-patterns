package com.companyname.designpatterns.behavioral.observer;


import com.companyname.designpatterns.behavioral.observer.impl.ObserverImpl;
import com.companyname.designpatterns.behavioral.observer.impl.Person;

/**
 * Created by davitpetrosyan on 9/15/16.
 */
public class Main {

    public static void main(String[] args) {

        ObserverImpl firstObserver = new ObserverImpl();
        ObserverImpl secondObserver = new ObserverImpl();


        Person davit = new Person();

        davit.addObserver(firstObserver);
        davit.addObserver(secondObserver);

        davit.setAge(22);
        davit.setAge(25);
    }
}
