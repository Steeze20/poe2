/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.part_2;

import java.util.Scanner;

/**
 *
 * @author Ngetelo
 */
public class login {
    private String     name,lastname,password,username;
 
  public boolean checkUsername(String username){
      
 return username.contains("_")&&username.length()<=5;
  }
    public boolean checkPasswordComplexity(String password){
        
    return password.length()>=8&&password.matches("1234567890")&&
                password.matches("[!@#$%^&*(){},.:;'<>?/|]")&&
                password.matches(".[A-Z]");
    }
    
    public String registerUser(String name,String lastname,String username,String password){
        if(checkUsername(username)!=true){
         return"Incorrect username";   
        }
        if(checkPasswordComplexity(password)!=true){
            return"Incorrect password";
        }
        
        this.name=name;
        this.lastname=lastname;
        this.username=username;
        this.password=password;
    return "Both password and username are correct";
    }
    
    public boolean loginUser(String username,String password){
        
        return username.equals( this.username=username)&&password.equals( this.password=password);
    
    }
      public String returnLoginStatus(boolean loginUser){
          if(loginUser){
              return"Welcome "+name+" "+lastname+" Great to see U"; 
          }
      return"Incorrect username or password";}
}
