/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.system;

public class Customer  {
  private  int customerId;
  private  String name;
   String address;


    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
    }
   

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        if(customerId >0)
        this.customerId = customerId;
        else 
         this.customerId = Math.abs(customerId);   
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
   
}
