package com.bikerapp.web_service.web_service.model;

import java.time.LocalDate;

public class Bike {
    private String model;
    private LocalDate registry_date;
    private int mileage;
    private Engine engine;

    public Bike() {
    }

    public Bike(String model, LocalDate registry_date, int mileage, Engine engine) {
        this.model = model;
        this.registry_date = registry_date;
        this.mileage = mileage;
        this.engine = engine;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getRegistry_date() {
        return registry_date;
    }

    public void setRegistry_date(LocalDate registry_date) {
        this.registry_date = registry_date;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", registry_date=" + registry_date +
                ", mileage=" + mileage +
                ", engine=" + engine +
                '}';
    }
}
