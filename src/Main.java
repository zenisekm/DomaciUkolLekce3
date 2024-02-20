import com.engeto.ja.Guest;
import com.engeto.ja.Room;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Guest guest1 = new Guest("Adéla Malíková ", LocalDate.of(1993,3,13));

        Guest guest2 = new Guest("Jan Dvořáček ", LocalDate.of(1995,5,5));


        System.out.println(guest1.getName() + guest1.getBirthdate());
        System.out.println(guest2.getName() + guest2.getBirthdate());

        Room room1 = new Room(1, 1,true, true, 1000);
        Room room2 = new Room(2, 1,true, true, 1000);
        Room room3 = new Room(3, 3,false, true, 2400);

        System.out.println(room1.getRoomNumber() + room1.getBeds() + room1.isBalcony() + room1.isSeaView() + room1.getPricePerNight());
















    }
}