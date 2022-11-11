package com.fullstack.springbootfirstapp.model;

import java.time.LocalDate;

public class Bookings {
    private String person;
    private String vehicletitle;
    private LocalDate pick;
    private String register;
    private LocalDate retcar;
    private String price;
    private int seating;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getVehicletitle() {
        return vehicletitle;
    }

    public void setVehicletitle(String vehicletitle) {
        this.vehicletitle = vehicletitle;
    }

    public LocalDate getPick() {
        return pick;
    }

    public void setPick(LocalDate pick) {
        this.pick = pick;
    }

    public String getRegister() {
        return register;
    }

    public void setRegister(String register) {
        this.register = register;
    }

    public LocalDate getRetcar() {
        return retcar;
    }

    public void setRetcar(LocalDate retcar) {
        this.retcar = retcar;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getSeating() {
        return seating;
    }

    public void setSeating(int seating) {
        this.seating = seating;
    }
}
