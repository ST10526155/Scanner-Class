/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package learnscanner;
import java.util.Scanner;
/**
 *
 * @author lab_services_student
 */
public class LearnScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("-------Accept User Details------");
        
          System.out.print("> Enter First Name: ");
          String fname = scan.nextLine();
          
          System.out.print("\n> Enter Last Name: ");
          String lname = scan.nextLine();
          
          System.out.print("\n> What is your Age: ");
          int age = scan.nextInt();
          
          System.out.println("\n ---Display User Details---");
          
          System.out.println("First Name: " + fname + "\nLast Name: " + lname + "\nAge: " + age);
          
    }
    
}
