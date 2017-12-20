package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by vaio on 20.12.2017.
 */
public class Air {

    private String pnr;
    private Set<Passenger> passengers = new HashSet<>();

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Set<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(Set<Passenger> passengers) {
        this.passengers = passengers;
    }
}
