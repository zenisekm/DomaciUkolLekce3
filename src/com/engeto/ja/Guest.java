package com.engeto.ja;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Guest {


    private String name;
    private LocalDate birthdate;

    private List<Guest> guestList = new ArrayList<>();


    public Guest(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }


    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }
}
