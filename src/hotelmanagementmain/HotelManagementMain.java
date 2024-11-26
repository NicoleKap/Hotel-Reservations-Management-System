/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotelmanagementmain;

/**
 *
 * @author Nikoleta Kapsali
 */
public class HotelManagementMain {

    public static void main(String[] args) {
        System.out.println("Hotel Management Application");
        System.out.println("==================================================="
                + "==================");
        System.out.println();
        
        // Δημιουργία ξενοδοχείου με το όνομα Radisson Blue
        
        Hotel hotel = new Hotel("Radisson Blue","Athens Center");
        
        // Δημιουργία τριών δωματίων
        
        Room firstRoom = new Room(101,"Double Room"); // 1 Δίκλινο με αριθμό 101
        Room secondRoom = new Room(102,"Triple Room"); // 1 Τρίκλινο με αριθμό 102
        Room thirdRoom = new Room(200,"Suite"); // 1 σουίτα με αριθμό 200
           
        // We add the rooms 
        
        hotel.addRoom(firstRoom);
        hotel.addRoom(secondRoom);
        hotel.addRoom(thirdRoom);

        
        Customer firstCustomer = new Customer("Dionisis Adamopoulos",123);
        Customer secondCustomer = new Customer("Apostolos Abatzoglou",987);
                
            
        System.out.println();
        hotel.makeReservation(firstRoom.getId(), firstCustomer);
        System.out.println();
        hotel.makeReservation(secondRoom.getId(), secondCustomer);
        System.out.println();
        hotel.makeReservation(firstRoom.getId(), secondCustomer);
        System.out.println();
        System.out.println();
        System.out.println(hotel.toString());
    }
}
