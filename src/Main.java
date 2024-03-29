import com.engeto.ja.Booking;
import com.engeto.ja.BookingManager;
import com.engeto.ja.Guest;
import com.engeto.ja.Room;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan Dvořáček ", LocalDate.of(1995, 5, 5));
        Guest guest3 = new Guest("Karel Dvořák", LocalDate.of(1990, 5, 15));
        Guest guest4 = new Guest("Karel Dvořák", LocalDate.of(1979, 1, 3));
        Guest guest5 = new Guest("Karolína Tmavá", LocalDate.of(1988, 8, 18));


        Room room1 = new Room(1, 1, true, true, 1000);
        Room room2 = new Room(2, 1, true, true, 1000);
        Room room3 = new Room(3, 3, false, true, 2400);


        Booking booking1 = new Booking(1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), false, room1, guest1, 1, 1000);
        Booking booking2 = new Booking(2, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), true, room2, guest1, 1, 1000);
        Booking booking3 = new Booking(3, LocalDate.of(2023, 6, 1), LocalDate.of(2023, 6, 7), false, room3, guest3, 1, 2400);
        Booking booking4 = new Booking(4, LocalDate.of(2023, 7, 18), LocalDate.of(2023, 7, 21), true, room1, guest2, 1, 1000);
        Booking booking5 = new Booking(5, LocalDate.of(2023, 8, 1), LocalDate.of(2023, 8, 31), true, room3, guest1, 1, 2400);




        // SEZNAM




        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);
        bookingList.add(booking3);
        bookingList.add(booking4);
        bookingList.add(booking5);

        BookingManager bookingManager = new BookingManager();
        for (Booking booking : bookingList) {
            bookingManager.addBooking(booking);
        }


        shortBookingInfo(bookingList);

        makeBookings(bookingList, room2, guest5);
        bookingsInfo(bookingManager);


        room3.addNewHost(guest3);
        room2.addNewHost(guest4);
        room2.addNewHost(guest5);
        room3.addNewHost(guest5);


        System.out.println(" ");
        System.out.println(" ");


        moreBookingInfo(bookingList);

        System.out.println(" ");
        System.out.println(" ");

         // ZDE VYPSÁNY REZERVACE POUZE KTERÉ JSOU JAKO DOVOLENÁ

        vacationBookings(bookingList);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        // 13. METODY PRO VYPSÁNÍ

        int oneGuestReservation = 0;
        int twoGuestsReservation = 0;
        int moreGuestsReservation = 0;

        oneGuestBooking(bookingList, oneGuestReservation);

        twoGuestsBooking(bookingList, twoGuestsReservation);

        moreGuestsBooking(bookingList, moreGuestsReservation);

        bookingLength(booking1);


    }

    private static void shortBookingInfo(List<Booking> bookingList) {
        for (Booking booking : bookingList) {
            System.out.println("Guest number: " + booking.getGuestsNumber()
                    + " From Date: " + booking.getReservedTimeFrom()
                    + " To Date: " + booking.getReservedTimeTo()
                    + " Type of vacation: " + booking.isVacation());
        }
    }

    private static void moreBookingInfo(List<Booking> bookingList) {
        for (Booking booking : bookingList) {
            System.out.println(
                    booking.getReservedTimeFrom() + " až " + booking.getReservedTimeTo() +
                            ": " + booking.getGuest().getName() + " " + "(" + booking.getGuest().getBirthdate() + ") " +
                            "[" + booking.getNumberOfGuests() + ", " + booking.getRoom().isSeaView() + "] " +
                            "za cenu " + booking.getRoomPrice() + "kč");
        }
    }

    private static void bookingLength(Booking booking1) {
        int bookingLength = booking1.getBookingLength();
        System.out.println("Délka rezervace: " + bookingLength + " dnů");
    }

    private static void moreGuestsBooking(List<Booking> bookingList, int moreGuestsReservation) {
        for (Booking booking : bookingList) {
            int threeGuestReservation = booking.getGuestsNumber();
            if (threeGuestReservation == 3) {
                moreGuestsReservation++;
            }
        }


        System.out.println("Počet rezervací s více hosty: " + moreGuestsReservation);
    }

    private static void twoGuestsBooking(List<Booking> bookingList, int twoGuestsReservation) {
        for (Booking booking : bookingList) {
            int numberOfGuests = booking.getNumberOfGuests();
            if (numberOfGuests == 2) {
                twoGuestsReservation++;
            }
        }

        System.out.println("Počet rezervací s dvěma hosty: " + twoGuestsReservation);
    }

    private static void oneGuestBooking(List<Booking> bookingList, int oneGuestReservation) {
        for (Booking booking : bookingList) {
           int numberOfGuest = booking.getNumberOfGuests();
            if (numberOfGuest == 1) {
                oneGuestReservation++;
            }
        }

        System.out.println("Počet rezervací s jedním hostem: " + oneGuestReservation);
    }

    private static void vacationBookings(List<Booking> bookingList) {
        System.out.println(" ******* PRVNÍCH 8 DOVOLENÝCH");

        int vacations = 0;

        for (Booking booking : bookingList) {
            if (booking.isVacation()) {
                System.out.println(booking.getGuest().getName());
                vacations++;
                if (vacations == 8) {
                    break;
                }
            }
        }
    }

    private static void bookingsInfo(BookingManager bookingManager) {
        System.out.println("All bookings: " + bookingManager.getBookings().size());
        System.out.println("Počet pracovních rezervací: " + bookingManager.getNumberOfWorkingBookings());
        System.out.println("Průměrný počet hostů na rezervaci: " + bookingManager.getAverageGuests());
        System.out.println("==== VYPSANI VSECH REZERVACI ====");
    }

    private static void makeBookings(List<Booking> bookingList, Room room2, Guest guest5) {
        for (int fromDate = 1; fromDate <= 20; fromDate+= 2) {
            LocalDate fromDateReservation = LocalDate.of(2024,8,fromDate);
            LocalDate toDateReservation = fromDateReservation.plusDays(1);

            bookingList.add(new Booking(4,fromDateReservation,
                    toDateReservation, true, room2, guest5, 1, 1000));

        }
    }


}












