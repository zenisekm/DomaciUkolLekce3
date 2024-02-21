package com.engeto.ja;

import java.time.LocalDate;

public class Booking {

    private int guestsNumber;
    private LocalDate reservedTimeFrom;
    private LocalDate reservedTimeTo;
    private boolean isVacation;


    public Booking(int guestsNumber, LocalDate reservedTimeFrom, LocalDate reservedTimeTo, boolean isVacation) {
        this.guestsNumber = guestsNumber;
        this.reservedTimeFrom = reservedTimeFrom;
        this.reservedTimeTo = reservedTimeTo;
        this.isVacation = isVacation;
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

    public boolean isVacation() {
        return isVacation;
    }

    public void setIsVacation(boolean isVacationVacation) {
        this.isVacation = isVacation;
    }
}



