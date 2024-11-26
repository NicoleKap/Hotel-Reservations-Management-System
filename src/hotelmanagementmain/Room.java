/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementmain;

/**
 *
 * @author Nikoleta Kapsali
 */
public class Room {
    private int id;
    private String type;
    private Customer customer;
    private boolean isFree;
    
    // Initializing the variables when a new object without arguments is created
    
    public Room () {
        this.id = 0;
        this.type = "";
        this.isFree = true;
    }
    
     // Initializing the variables when a new object with arguments is created
    
    public Room(int roomID,String type) {
        this.id = roomID;
        this.type = type;
        this.isFree = true;
    }
    
    // Getters & Setters
    
    public int getId(){
        return this.id;
    }

    public String getType() {
        return type;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer (Customer customer) {
        this.customer = customer;
        this.isFree = false;
    }
    
    public void setType (String type) {
        this.type = type;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    public boolean isFree() {
        return this.isFree;
    }
    
    // This method shows the room info
    
    public String toString() {
        String roomStatus = isFree ? "Free":"Ocupied";
        return "\nRoom Information" + 
                "\n------------------------------------"
                + "----------------------------------" +
                "\nRoom ID: " + id + 
                "\nRoom Type: " + type +
                "\nAvaliability: "+ roomStatus + 
                "\n------------------------------------"
                + "----------------------------------";
    }
}
