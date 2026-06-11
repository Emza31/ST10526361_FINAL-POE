/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.message;

/**
 *
 * @author Student
 */
public class MessAgeApp {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
 Message.addMessage("1001","+27834557896","Did you get the cake?","HASH001","Sent");
 // message 2 being included
 Message.addMessage("1002","+27838884567","Where are you? You are Late!I have asked you to be on time.");
 // message 3 being included
 Message.addMessage("1003","+27834484567","Yohooo I am at your gate.","HASH003","Disregard");
 // message 4 applying
 Message.addMessage ("083884567","It is dinner time!","HASH004","Sent");
 // message 5 sent
 Message.addMessage("+27838884567","Ok,I am leaving without you.","HASH005","Stored");
 
 int option;
 do {
     option = Integer.parseInt(JOptionPane. showInputDialog(
     "1. Display Longest Message/n"
             + "2. Search Message ID/n"
             + "3. Search Recipient/n"
             + "4. Delete Message/n "
             + "5. Display report/ n"
             + "6. Exit"));
     switch (option){
        case 1:
            Message.DisplayLongestMessage();
            break;
            
        case 2:
            Message.searchMessageID();
            break;
        case 3:
            Message.searchRecipient();
            break;
        case 4:
            Message.deleteMessage();
            break;
        case 5:
            Message.displayReport();
            break;
     }
 }
 while (option  = 6);
  
    }
    }