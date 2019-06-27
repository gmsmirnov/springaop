package ru.gsmirnov.springapp.models;

public class Instrumentalist implements Performer {
    private final Instrument instrument;

    public Instrumentalist(Instrument instrument) {
        this.instrument = instrument;
    }

    @Override
    public void perform() {
        System.out.println("Instrumentalist plays:");
        this.instrument.play();
    }
}
