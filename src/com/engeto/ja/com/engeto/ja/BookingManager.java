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


        // ZDE ZKOUŠKA NASTAVENÍ PRACOVNÍCH POBYTŮ

         public int getNumberOfWorkingBookings() {
            int numberOfWorkingBookings = 0;
            for (Booking booking : booking) {
                if (!booking.isVacation()) {
                    numberOfWorkingBookings++;
                }

            }
            return numberOfWorkingBookings;
         }



     // ZDE NETUŠÍM JAK NASTAVIT ABY MĚ TO VRÁTILO PRŮMĚR

    //    public double getAvergeGuests(){
    //        int totalGuests = 0;
    //        for (Booking booking : booking) {
    //        totalGuests += booking.getNumberOfGuests();
    //        }
    //        int i = totalGuests / getBookings();
    //        return i;
    //         }

}
