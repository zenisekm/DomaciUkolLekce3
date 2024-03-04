package com.engeto.ja;

import java.util.ArrayList;
import java.util.List;

public class Room  {

    private int roomNumber;
    private int beds;
    private  boolean balcony;
    private boolean seaView;
    private int pricePerNight;


    private List<Guest> guestList = new ArrayList<>();




    public Room(int roomNumber, int beds, boolean balcony, boolean seaView, int pricePerNight) {
        this.roomNumber = roomNumber;
        this.beds = beds;
        this.balcony = balcony;
        this.seaView = seaView;
        this.pricePerNight = pricePerNight;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public boolean isBalcony() {
        return balcony;
    }

    public void setBalcony(boolean balcony) {
        this.balcony = balcony;
    }

    public boolean isSeaView() {
        return seaView;
    }

    public void setSeaView(boolean seaView) {
        this.seaView = seaView;
    }

    public int getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(int pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void addNewHost(Guest newGuest) {
        this.guestList.add(newGuest);
    }
}



