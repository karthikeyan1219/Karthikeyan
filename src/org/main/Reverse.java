package org.main;

public class Reverse {
	
	public static void main(String[] args) {
		String s="malayalam";
		String t="";
		for(int i=s.length()-1;i>=0;i--) {
		
			t=t+s.charAt(i);
		}
		System.out.println(t);
		
		if(s==t)
		{	
		System.out.println("It is not a Palindrome");
		}
		else
		{
		System.out.println("It is  a Palindrome");	
		}
		}
		
	}
	
	
	
	


