package com.engeto.ja;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Booking {

    private int guestsNumber;
    private LocalDate reservedTimeFrom;
    private LocalDate reservedTimeTo;
    private boolean isVacation;

    private Room room;
    private Guest guest;


    private int numberOfGuests;
    private int roomPrice;


    public Booking(int guestsNumber, LocalDate reservedTimeFrom, LocalDate reservedTimeTo, boolean isVacation, Room room, Guest guest, int numberOfGuests, int roomPrice) {
        this.guestsNumber = guestsNumber;
        this.reservedTimeFrom = reservedTimeFrom;
        this.reservedTimeTo = reservedTimeTo;
        this.isVacation = isVacation;

        this.room = room;
        this.guest = guest;


        this.numberOfGuests = numberOfGuests;
        this.roomPrice = roomPrice;
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



    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }




    public void setVacation(boolean vacation) {
        isVacation = vacation;
    }



    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }



    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }


    public int getBookingLength () {
     LocalDate start = getReservedTimeFrom();
     LocalDate end = getReservedTimeTo();
     long daysBetween = ChronoUnit.DAYS.between(start, end);
     return (int) daysBetween;
    }




    public int getPrice () {
        int priceForNight = getRoomPrice();
        int numberOfNights = getBookingLength();

        int result = priceForNight * numberOfNights;

        return result;


    }







}





