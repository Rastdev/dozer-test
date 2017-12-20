package com.example.demo.model;

/**
 * Created by vaio on 20.12.2017.
 */
public class Document implements MappingAware {
    private String number;
    private Passenger passenger;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    @Override
    public void finishMapping() {
        System.out.println("Document.finishMapping");
    }
}
