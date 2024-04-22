/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e.commerce.system;
import java.util.Scanner;
import java.util.Scanner;import javax.swing.JOptionPane;
public class ECommerceSystem {
 public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
        JOptionPane.showMessageDialog(null, " welcome to e commerce system");
    Electronicproduct e1=new Electronicproduct("Smart Phone",1,599.9f,"Summsung",1);
    clothingproduct c2=new clothingproduct("T-shirt",2,19.99f,"Medium","cotton");
    BookProduct b1=new BookProduct("OOP",3,39.99f,"O'Reilly","X Publications");
     int customrtid= Integer.parseInt(JOptionPane.showInputDialog("Enter Your ID: "));        
                 String customrtname=JOptionPane.showInputDialog("Enter Your name "); 
                String customrtaddress= JOptionPane.showInputDialog("Enter Your address ");
    Customer customer= new Customer(customrtid,customrtname, customrtaddress);
       int nomproducts= Integer.parseInt(JOptionPane.showInputDialog("how many products you want to add "));
     cart car=new cart(customer.getCustomerId(),nomproducts);
    for(int i=0;i<nomproducts;i++){
       JOptionPane.showMessageDialog(null, "choose product to add");           
       JOptionPane.showMessageDialog(null, "1:smart phone, 2:t shirt ,3: oop book"); 
        int choise= Integer.parseInt(JOptionPane.showInputDialog("Enter Your choise "));   
     
            product product;
            switch (choise) {
                case 1:
                    product = e1;
                    break;
                case 2:
                    product = c2;
                    break;
                case 3:
                    product = b1;
                    break;
                default:
                   JOptionPane.showMessageDialog(null, "invalid choise");
                    i--;
                    continue;
            }
            car.addproduct(product);
        }
 JOptionPane.showMessageDialog(null, " whould you like to place the order ? 1-yes/2-no");            
        int choise2 = Integer.parseInt(JOptionPane.showInputDialog("Enter your choise: "));        
       if( choise2==1){
            Order order = new Order(customer.getCustomerId(), 1 );
            car.placeorder(order, car);
            order.printOrderInfo();
        } else {
            System.out.println("Thank you for using our E-Commerce system!");
        }

    }
}
                 
             
         
  
     
     
     
     
    
  
    
    

