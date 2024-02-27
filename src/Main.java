import com.engeto.ja.Booking;
import com.engeto.ja.Guest;
import com.engeto.ja.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ", LocalDate.of(1993,3,13));

        Guest guest2 = new Guest("Jan Dvořáček ", LocalDate.of(1995,5,5));

        System.out.println(guest1.getName() + guest1.getBirthdate());
        System.out.println(guest2.getName() + guest2.getBirthdate());

        Room room1 = new Room(1, 1,true, true, 1000);
        Room room2 = new Room(2, 1,true, true, 1000);
        Room room3 = new Room(3, 3,false, true, 2400);


        // ZDE VYPSAT POKOJE NA OBRAZOVKU

        Booking booking1 = new Booking(1, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),false);
        Booking booking2 = new Booking(2,LocalDate.of(2021,9,1), LocalDate.of(2021,9,14),true);


        // SEZNAM

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        System.out.println(bookingList.size());
        System.out.println(bookingList.get(0).getGuestsNumber());
        System.out.println(bookingList.get(0).isVacation());

        for (Booking booking : bookingList) {
          System.out.println("Guest number: " + booking.getGuestsNumber()
                  + " From Date: " + booking.getReservedTimeFrom()
                  + " To Date: " + booking.getReservedTimeTo()
                  + " Type of vacation: " + booking.isVacation());

      }


























    }
}