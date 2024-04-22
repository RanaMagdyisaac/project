/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e.commerce.system;
import java.util.Scanner;
import javax.swing.JOptionPane;
 class Order {
    cart c1;   //nproducts
     int customerId;
     int orderId;
     product[] products;
 

    public Order() {
    }

    public Order(int customerId, int orderId) {
        this.customerId = customerId;
        this.orderId = orderId;
        
    }
    private double calculateTotalPrice() {
        double total = 0;
        for (product product : products) {
            if (product != null) {
                total += product.getPrice();
            }
        }
        return total;
    }

    public void printOrderInfo() {
       String message="Here's your order summary \n order id:"+orderId+ "\n customer id"+customerId +"\n products in order:" ; 
         for(int i=0;i<c1.nProducts;i++){ 
            if(c1.products[i] != null){ 
 
              message+=  c1.products[i].toString(); 
                 
            }} 
     message+= "total price"+ c1.calculatePrice(); 
   JOptionPane.showMessageDialog(null,message  ); 
    }
}   