package com.engeto.ja;

import java.time.LocalDate;

public class Booking {

    private int guestsNumber;
    private LocalDate reservedTimeFrom;
    private LocalDate reservedTimeTo;
    private String typeOfVacation;


    public Booking(int guestsNumber, LocalDate reservedTimeFrom, LocalDate reservedTimeTo, String typeOfVacation) {
        this.guestsNumber = guestsNumber;
        this.reservedTimeFrom = reservedTimeFrom;
        this.reservedTimeTo = reservedTimeTo;
        this.typeOfVacation = typeOfVacation;
    }


    public int getGuestsNumber() {
        return guestsNumber;
    }

    public void setGuestsNumber(int guestsNumber) {
        this.guestsNumber = guestsNumber;
    }

    public LocalDate getReservedTimeFrom() {
        return reservedTimeFrom;
    }

    public void setReservedTimeFrom(LocalDate reservedTimeFrom) {
        this.reservedTimeFrom = reservedTimeFrom;
    }

    public LocalDate getReservedTimeTo() {
        return reservedTimeTo;
    }

    public void setReservedTimeTo(LocalDate reservedTimeTo) {
        this.reservedTimeTo = reservedTimeTo;
    }

    public String getTypeOfVacation() {
        return typeOfVacation;
    }

    public void setTypeOfVacation(String typeOfVacation) {
        this.typeOfVacation = typeOfVacation;
    }
}



