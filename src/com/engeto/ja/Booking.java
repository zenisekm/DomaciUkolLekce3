package com.engeto.ja;

import java.time.LocalDate;

public class Booking {

    private int guestsNumber;
    private LocalDate reservedTime;
    private String typeOfVacation;

    public Booking(int guestsNumber, LocalDate reservedTime, String typeOfVacation) {
        this.guestsNumber = guestsNumber;
        this.reservedTime = reservedTime;
        this.typeOfVacation = typeOfVacation;
    }

    public int getGuestsNumber() {
        return guestsNumber;
    }

    public void setGuestsNumber(int guestsNumber) {
        this.guestsNumber = guestsNumber;
    }

    public LocalDate getReservedTime() {
        return reservedTime;
    }

    public void setReservedTime(LocalDate reservedTime) {
        this.reservedTime = reservedTime;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
}
