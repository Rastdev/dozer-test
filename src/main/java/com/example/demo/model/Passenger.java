package com.example.demo.model;

/**
 * Created by vaio on 20.12.2017.
 */
public class Passenger implements MappingAware {
    private String name;
    private String internalId;
    private Document document;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }

    public String getInternalId() {
        return internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    @Override
    public void finishMapping() {
        System.out.println("Passenger.finishMapping");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Passenger passenger = (Passenger) o;

        return internalId != null ? internalId.equals(passenger.internalId) : passenger.internalId == null;

    }

    @Override
    public int hashCode() {
        return internalId != null ? internalId.hashCode() : 0;
    }
}
