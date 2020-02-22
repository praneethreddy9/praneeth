package com.capgemini.loginui;

import java.util.Scanner;

import com.capgemini.loginservice.Serviceimp1;

public class UserInterface {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter the email_id");
String email_id=sc.next();
System.out.println("Enter the password");
String password=sc.next();
Serviceimp1 sp=new Serviceimp1();
int ap=sp.servicemethod(email_id,password);
if(ap==1) {
System.out.println("Login Sucessfully");
}
else {
System.out.println("CLICK ON FORGOT PASSWORD");
     
        System.out.println("Enter the new password");
        password=sc.next();
        System.out.println("Password changed successfully");
}


}
}


