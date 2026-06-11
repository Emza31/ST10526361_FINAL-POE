package com.mycompany.chatapp_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Login {
 //-------------------------------------------
 //these variables store the details of the user
 //once a user registers,their  details are saved here
 //--------------------------------------------
 String username;
 String password;
 String phonenumber;

 //------------------------------------------------
 //1. Check Username
 //You are required to show:
 //- USERNAME must contain an underscore"_"
 //-USERNAME is no more than 5 characters long
 //-----------------------------------------------
 public boolean checkUsername(String username){
  // USERNAME contains"_"
  // USERNAMAME not longer than 5 characters
  return username.contains("_")&& username.length() <=5;
 }
  //--------------------------------------------------
  // 2. Check Password Complexity
  // password requirements:
  // -At least 8 characters 
  // -At least one Capitsl letters 
  // -At least one Number
  // -At least one Special character
  //----------------------------------------------------
  public boolean checkPasswordComplexity(String password){
   
    boolean hasCapital = false;
    boolean hasNumber = false;
    boolean hasSpecial = false;
    String SpecialChars = "!@#$%^&*";
    // define special characters

    for (int i = 0; i < password.length();i++){
        char c = password.charAt(i);

        if (Character.isUpperCase(c)){
            hasCapital = true;
        } else if (Character.isDigit(c)){
            hasNumber = true;
        } else if (!Character.isLetterOrDigit(c)){
            hasSpecial= true;
        }
        }

  return password.length()>=8 && hasCapital && hasNumber && hasSpecial;
  }

//------------------------------------
// 3.check phoneNumber
// What is expected :
// phoneNumber must start with +27
// must consists of 10 digit
//is not more than 12 characters long
//----------------------------------------
public boolean CheckphoneNumber(String phoneNumber){
 return phoneNumber.startsWith("+27")&& phoneNumber.length()<= 12;
}
  //------------------------------
 // 4. check rgister user metodh
 // username
 // password
// phoneNumber
// storeas data and everything required
// returns specfic messages
//------------------------------------------
public String registerUser(String username,String password,String phoneNumber){
    
 if (checkUsername(username)){
return "Usrname is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in lenth";
}
 if (checkPasswordComplexity(password)){
 return"password is not correctly formatted; please ensure that the password contains atleast eight characters,a capital letter,a number,and a spaecial character.";
}
 if (CheckphoneNumber(phoneNumber)){
 return "phoneNumber incorrectly formattedor does not contain internationa code.";
}
 this.username  = username;
 this.password = password;
 this.phonenumber = phoneNumber;
 return "User rigistered succesfully.";
} 
 //----------------------------
 // login feature
 //-----------------------
 public boolean loginUser(String username, String password){
     return this.username.equals (username)&& this.password.equals(password);
 }
 public String returnLoginStatus(boolean success) { 
     if (success){
         return "Welcome"+ username + "it is great to seeyou again.";
     }else{
         return "username or password incorrect, please try again.";
     }
 }
}
 



 

    
    

 