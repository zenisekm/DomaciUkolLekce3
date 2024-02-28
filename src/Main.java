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
        Guest guest3 = new Guest("Karel Dvořák", LocalDate.of(1990,5,15));
        Guest guest4 = new Guest("Karel Dvořák", LocalDate.of(1979, 1,3));
        Guest guest5 = new Guest("Karolína Tmavá", LocalDate.of(1988, 8,18));


        System.out.println(guest1.getName() + guest1.getBirthdate());
        System.out.println(guest2.getName() + guest2.getBirthdate());

        Room room1 = new Room(1, 1,true, true, 1000);
        Room room2 = new Room(2, 1,true, true, 1000);
        Room room3 = new Room(3, 3,false, true, 2400);


        // ZDE VYPSAT POKOJE NA OBRAZOVKU

        Booking booking1 = new Booking(1, LocalDate.of(2021,7,19),LocalDate.of(2021,7,26),false,1,1);
        Booking booking2 = new Booking(2,LocalDate.of(2021,9,1), LocalDate.of(2021,9,14),true,2,1);
  //    Booking booking3 = new Booking(3, LocalDate.of(2023,6,1), LocalDate.of(2023,6,7),false,5,3,1);
  //    Booking booking4 = new Booking(4, LocalDate.of(2023,7,18), LocalDate.of(2023,7,21), true, 6, 2,1);
  //    Booking booking5 = new Booking(5, LocalDate.of(2023,8,1), LocalDate.of(2023,8,2), true,7,2,1);
  //    Booking booking6 = new Booking(5, LocalDate.of(2023,8,3), LocalDate.of(2023,8,4), true,8,2,1);
  //    Booking booking7 = new Booking(5, LocalDate.of(2023,8,5), LocalDate.of(2023,8,6), true,9,2,1);
  //    Booking booking8 = new Booking(5, LocalDate.of(2023,8,7), LocalDate.of(2023,8,8), true,10,2,1);
  //    Booking booking9 = new Booking(5, LocalDate.of(2023,8,9), LocalDate.of(2023,8,10), true,11,2,1);
  //    Booking booking10 = new Booking(5, LocalDate.of(2023,8,11), LocalDate.of(2023,8,12), true,12,2,1);
  //    Booking booking11 = new Booking(5, LocalDate.of(2023,8,13), LocalDate.of(2023,8,14), true,13,2,1);
  //    Booking booking12 = new Booking(5, LocalDate.of(2023,8,15), LocalDate.of(2023,8,16), true,14,2,1);
  //    Booking booking13 = new Booking(5, LocalDate.of(2023,8,17), LocalDate.of(2023,8,18), true,15,2,1);
  //    Booking booking14 = new Booking(5, LocalDate.of(2023,8,19), LocalDate.of(2023,8,20), true,16,2,1);

        // VYTVOŘENO, NEŽ SEM SI PŘEČETL ŽE TO MÁ BÝT PŘES CYKLUS.


       // SEZNAM

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
    // bookingList.add(booking3);
    // bookingList.add(booking4);
    // bookingList.add(booking5);
    // bookingList.add(booking6);
    // bookingList.add(booking7);
    // bookingList.add(booking8);
    // bookingList.add(booking9);
    // bookingList.add(booking10);
    // bookingList.add(booking11);
    // bookingList.add(booking12);
    // bookingList.add(booking13);
    // bookingList.add(booking14);

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