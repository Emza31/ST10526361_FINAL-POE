/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapp_1;
import java.util.Scanner;
/**
 *
 * @author Student
 */
public class MainApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
 // Scanner allows the user to enter information
 Scanner input= new Scanner(System.in );
 
 // Create an object of the Login class so we can call its metods
 Login login = new Login();
 
 //------Registration section------
System.out.println("===User Registration===");
System.out.print("Enter a username:");
String username =input.nextLine();

System.out.print("Enter a password:"); 
String password= input.nextLine();

System.out.print("Enter your south african phone number(+27...):");
String phone = input.nextLine();

// Call the resgiterUser method and store the message it returns
String response = login.registerUser(username, password, phone);

// Show the registration message
System.out.println(response);

//------Login Section-----
System.out.println("/n==USER LOGIN==");

System.out.print("Enter your username:");
String loginUsername = input.nextLine();

System.out.print("Enter your password:");
String loginpassword = input.nextLine();

// Call loginUser to check details match the stored ones
boolean loggedln = login.loginUser(username, password);

// print out the correct login message
String loginmessage=login.returnLoginStatus(loggedln);
System.out.println(loginmessage);


    }
}
