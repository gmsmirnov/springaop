package ru.gsmirnov.springapp.models;

public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("Strum-strum-strum!!!");
    }
}
