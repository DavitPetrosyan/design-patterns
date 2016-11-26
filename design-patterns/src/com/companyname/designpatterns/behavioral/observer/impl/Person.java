package com.companyname.designpatterns.behavioral.observer.impl;


import com.companyname.designpatterns.behavioral.observer.interfaces.Observer;
import com.companyname.designpatterns.behavioral.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davitpetrosyan on 9/15/16.
 */
public class Person implements Subject {

    List<Observer> observerList = new ArrayList<Observer>();

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if(age == 25) {
            notifyObservers();
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observerList) {
            observer.update(this.getName());
        }
    }
}
