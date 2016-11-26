package com.companyname.designpatterns.behavioral.observer.interfaces;

/**
 * Created by davitpetrosyan on 9/15/16.
 */
public interface Subject {

    public void addObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();

}
