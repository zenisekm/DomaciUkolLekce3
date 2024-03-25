package com.engeto.ja;

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




        // ZDE VRÁCENÍ PRACOVNÍCH POBYTŮ

         public int getNumberOfWorkingBookings() {
            int numberOfWorkingBookings = 0;
            for (Booking booking : booking) {
                if (!booking.isVacation()) {
                    numberOfWorkingBookings++;
                }

            }
            return numberOfWorkingBookings;
         }



      //  ZDE PRŮMĚR

         public double getAvergeGuests(){
             int totalGuests = 0;
             int totalBookings = booking.size();

             for (Booking booking : booking) {
             totalGuests += booking.getNumberOfGuests();
             }
            return (double) totalBookings / totalGuests;


              }


             public String getAverageGuests() {
             return null;
                 }
}

