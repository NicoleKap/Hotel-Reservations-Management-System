/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementmain;

/**
 *
 * @author Nikoleta Kapsali
 */
public class Hotel {
    private String name;
    private String location;
    private Room[] roomlist;
    private int roomCount;
    
    // The constructor method without arguments
    
    public Hotel() {
        this.name = ""; //Initializing Values
        this.location = "";
        this.roomlist = new Room[10];
        roomCount = 0;
    }
    
    // The constructor method with 2 arguments
    
    public Hotel (String name, String location){
        this.name = name;
        this.location = location;
        this.roomlist = new Room[10];
        roomCount = 0;
    }
    
    // Setters & Getters 
    
    public void setName(String name) {
        name = this.name;
    }
    
      public void setLocation(String location) {
        location = this.location;
    }

    public void setRoomlist(Room[] roomlist) {
        this.roomlist = roomlist;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public String getName() {
        return this.name;
    }
     
    public String getLocation() {
        return this.location;
    }
    
    public Room[] getRoomlist() {
        return this.roomlist;
    }

    public int getRoomCount() {
        return roomCount;
    }

    // The addRoom method for adding a new room in the Hotel
    
    public void addRoom(Room r) {
        if (roomCount < roomlist.length) {
            roomlist[roomCount] = r;
            roomCount++;
            System.out.println("The room " + r.getId() + " has been added Successfully");
            System.out.println(r.toString());
        }else {
            System.out.print("No more rooms can be added to the hotel.");
        }
    }
    
    // This method permits clients to make a room reservation
    
    public void makeReservation(int roomID, Customer customer) {
        for(Room room : roomlist) {
            if(room != null && room.getId() == roomID) {
                if(room.isFree()){
                    room.setCustomer(customer);
                    System.out.println("The room " + roomID +
                            " has been reserved by the customer with the "
                                    + "details below\n\n" 
                            + customer);
                }else {
                System.out.print("The room " + roomID + " is not available");
            }
             return;   
            }           
            
        }
        System.out.println("The room is not found"); 
    }
    
    // This method shows the Hotel Info
  
    public String toString() {
        return "Hotel Information" + "\n------------------------------------"
                + "----------------------------------" + 
                "\nHotel Name: " + this.name +
                "\nHotel Location: " + this.location +
                "\nRooms Number: " + roomlist.length;
    }
}

