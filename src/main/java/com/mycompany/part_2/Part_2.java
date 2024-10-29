/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.part_2;


import java.util.Scanner;
import javax.swing.*;
import java.util.Arrays;


/**
 *
 * @author unathi
 */
public class Part_2 {
// String name,lastname,password,username;
//Scanner fil= new Scanner(System.in);
    public static void main(String[] args) {
        login fil= new login();
        Scanner ful= new Scanner(System.in);
        final JDialog log=new JDialog();
        log.setAlwaysOnTop(true);
        
         //Registeration
       System.out.println("Please enter name");
      String  name=ful.next();
         System.out.println("Please enter surname");
        String lastname=ful.next();
          System.out.println("Please enter username");
       String username=ful.next();
       System.out.println("Please enter password");
       String password=ful.next();
       //Registeration successful?
    System.out.println( fil.registerUser(name, lastname, username, password));
    //Login Username and Password
      System.out.println("Please enter username");
       String usernam=ful.next();
         System.out.println("Please enter password");
       String pass=ful.next();
        System.out.println( fil.returnLoginStatus(fil.loginUser(usernam, pass)));
        
        JOptionPane.showMessageDialog(log, "Welcome to EasyKanban");
  while (fil.loginUser(usernam, pass)==true) {
     
       
     Task ad=new Task();
     String menu="""
                 Menu:\n1)Add tasks\n2) Show report \n3) Quit""";

String choice =

JOptionPane.showInputDialog(menu);

switch (choice) {case "1" -> //option for add task
    
    ad.addTask();

case "2" -> //option for report showing
 ad.display();
case "3" -> //exit option
{
    JOptionPane.showMessageDialog(null, "Exiting application.");
    return; }

default -> JOptionPane.showMessageDialog(null, "Invalid option. Please try again.");
}
 } 
 
}
    }

