package com.demo;
import java.util.Scanner;
public class StringTasks {
	public static void main(String args[])
	{	
	String str;
	char ch;
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the Sring:");
	str = in.nextLine();
	System.out.println("Enter the Letter:");
	ch = in.next().charAt(0);
	int count=0;
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==ch) {
			count++;
		}	
	}
	System.out.println(count);
	in.close();
	}	
}
