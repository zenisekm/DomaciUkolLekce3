package com.engeto.ja.com.engeto.ja;


import com.engeto.ja.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

       private List<Booking> booking = new ArrayList<>();

        public void addBooking(Booking newBooking) {
            booking.add(newBooking);
        }

        public List<Booking> getBooking(int index) {
            return (List<Booking>) booking.get(index);
        }

        public void clearBookings() {
            booking.clear();
        }

        public List<Booking> getBookings()  {
            return new ArrayList<>(booking);
        }











        // ZDE NETUŠÍM JAK NASTAVIT ABY MĚ TO VRÁTILO POUZE PRACOVNÍ POBYTY

     // public List<Booking> getNumberOfWorkingBookings() {
     //  return;
     // }

     // ZDE NETUŠÍM JAK NASTAVIT ABY MĚ TO VRÁTILO PRŮMĚR

     // public List<Booking> getAverageGuests() {
     //  return;
     //


}
