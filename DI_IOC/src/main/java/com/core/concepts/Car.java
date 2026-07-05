package com.core.concepts;

public class Car {

    // Manually creating object and injecting it
    //Engine engine = new Engine();
    Engine engine;

//    public Car(Engine engine) {
//        this.engine = engine;
//    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.startEngine();
        System.out.println("Car Started");
    }
}