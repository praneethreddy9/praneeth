package com.capgemini.logindao;


import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class LoginDao {
	HashMap<String,String> mydata=new HashMap<String,String>();
	
	public LoginDao()
	{ 
		mydata.put("praneethreddy3155@gmail.com", "12345");
		mydata.put("bhargav1122@gmail.com", "54321");
		mydata.put("vivek1234@gmail.com", "987654");
	}
	public int loginmethod(String email_id,String password){
		Scanner s=new Scanner(System.in);
		LoginDao lg=new LoginDao();
		
		Set<String> keys = mydata.keySet();
		Collection<String> values= mydata.values();
		String str = null;
		String pswrd;
		int z=0;

		for(String name : mydata.keySet()) 
		{
		 
		  boolean  a= mydata.containsKey(email_id) &&  mydata.get(email_id).equals(password);
		  System.out.println(a);
		  int val = (a) ? 1 : 0;
		   switch(val) 
		   {
		   case 1:
		   {
		       str="LOGIN SUCCESFULLY";
		       z=1;
		   }
		      break; 
		   case 0:
		   {
		   str= "Login failed";
		     z=0;
		   }break;
		}break;
		}
		return z;
		}
}

