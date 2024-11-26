/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotelmanagementmain;

/**
 *
 * @author Nikoleta Kapsali
 */
public class Customer {
    private String name;
    private int creditCard;
    
    // The constructor method without arguments
    
    public Customer () {
        this.name = "";
        this.creditCard = 000;
    }
   
    // The constructor method with arguments
    
    public Customer (String name,int cardNumber){
        
        this.name = name;
        this.creditCard = cardNumber;
        
    }

    // Setters are used for assigning values to variables when updates are needed

    public void setCreditCard(int creditCard) {
        this.creditCard = creditCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters are used for returning variables values
    
    public String getName() {
        return name;
    }

    public int getCreditCard() {
        return creditCard;
    }

    public String toString() {
        return "Name: " + name + "\nCredit Card (last digits): " 
                + creditCard;
    }
  
}
