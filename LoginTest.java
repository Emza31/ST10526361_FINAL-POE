/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapp_1;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author Student
 */
public class LoginTest { 
    
 // Create a login object to access metods in login.java
 Login login = new Login();
 
 //Username test -Valid: with underscore and <5 chars
 @Test
 public void testValidUsername(){ 
  // prepare data  a valid udernsme has underscore and <5 chars
  boolean result = login.checkUsername("kyl_1");
  //compare results: expect true
  
 }
  //Username test: INVALID without an underscore or too long should fail
 @Test
 public void testInvalidUsername(){ 
     boolean results = login.checkUsername("kyle!!!!!");
    //" Username  is correctly formatted; please ensure that your username contain an underscore and is no longer than 5 characters
   
 }
 //1. password test-Valid
@Test
 public void testValidpassword(){
     // Valid :>8 chars,capital ,number,special char
     boolean results = login.checkPasswordComplexity("Ch&&sec@ke99!");
boolean password = true;
 }
 // password test- Invalid
 @Test
 public void testInvalidpassword(){
     boolean results = login.checkPasswordComplexity("password");
  boolean password = false;
  
 }
 //2. phone numbber test -Valid
 @Test
 public void testValidphone(){
   boolean results = login.CheckphoneNumber("+27838968976" );
   boolean phone = true;
   
 }
 //3. phone number test - Invalid
 @Test
 public void testInvalidphone(){
     boolean results = login.CheckphoneNumber("99456425");
     boolean phone = false;
     
 }
 //4.  register user test - check exact messages
@Test
 public void testResgisterUser(){
  String result = login.registerUser("kyl_1","Ch&&sec@kee99!","+2783968976" );
    
 }
   //5. login success test - must resgister first
 @Test
 public void testLoginSuccess(){ 
     // step 1: register user first
   login.registerUser("kyl_1"," Ch&&sec@ke99!","+2783968976");
   // step 2 : Test login with correct details
   boolean results = login.loginUser("kyl_1","Ch&&sec@ke99!");
   boolean loginSuccess = true;
   
 }
 @Test
 // login failure test-wrongpassword
public void testLoginFailure(){
    login.registerUser("kyle" ,"password","99455425");
    boolean result= login.loginUser("kyl_1","Ch&&sec@ke99!");
    boolean loginfailure = false;
    
}       
}
