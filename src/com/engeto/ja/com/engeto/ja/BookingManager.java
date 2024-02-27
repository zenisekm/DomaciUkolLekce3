package com.engeto.ja.com.engeto.ja;


import com.engeto.ja.Booking;

import java.util.ArrayList;
import java.util.List;

public class BookingManager {

       private List<Booking> booking = new ArrayList<>();

        public void addBooking(Booking newBooking) {
                booking.add(newBooking);
        }

        public void clearBookings() {
                booking.clear();
        }

        public List<Booking> getBookings()  {
                return new ArrayList<>(booking);
        }

        public List<Booking> getBookingByIndex() {
            return new ArrayList<>(booking);
        }

        // NETUŠÍM CO JAK VYTVOŘIT getBooking(index)


}
