package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class SampleClass {
	public static void main(String args[]) {

////	Swapping the 2 values without using 3rd variable
//		{
//		int a=5,b=10;
//		System.out.println("A = 5");
//		System.out.println("B = 10");
//		System.out.println((a+b)-a);
//		System.out.println((a+b)-b);
//		}

////	Separating the given number into digits
//		{
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the value for c:");
//		int c = in.nextInt();
//		int d;
//		while(c>0)
//		{
//		d=c%10;
//		c=c/10;
//		System.out.println(d);
//		}
//		in.close();
//		}

////	Sum of digits of getting input from user
//		{
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the value for c:");
//		int e = in.nextInt();
//		int f,sum=0;
//		while(e>0)
//		{
//		f=e%10;
//		sum=sum+f;
//		e=e/10;
//		}
//		System.out.println(sum);
//		in.close();
//		}

//// 	Type Casting or Type Conversion		
//		{
//		int c = 128;
//		byte d = (byte) c;
//		System.out.println(c);
//		System.out.println(d);
//		}

////	Array
//		{
//		int[] arr= {1,2,3,4,5};
//		for(int i=0;i<arr.length;i++)
//		System.out.println(arr[i]);
//		}

////	Single dimension array
//		{
//			int[] obj = new int[5];
//			obj[0] = 1;
//			obj[1] = 2;
//			obj[2] = 3;
//			obj[3] = 4;
//			obj[4] = 5;
//		}

		
//// Array with getting input from user 
//		{ 
//		Scanner in = new Scanner(System.in);
//		System.out.print("Enter the number of elements in the array: "); 
//		int size = in.nextInt(); 
//		int[] array = new int[size]; 
//		System.out.println("Enter " + size + " elements:"); 
//		for (int i = 0; i < size; i++) 
//		{ 
//		System.out.print("Element "+ (i + 1) + ": "); 
//		array[i] = in.nextInt(); }
//		System.out.println("You entered:"); 
//		for (int i = 0; i < size; i++) 
//		{
//		System.out.print(array[i] + " "); 
//		} 
//		in.close();
//		}
		
//
		{
		Scanner in = new Scanner(System.in);
		String[] obj = new String[5];
		for(int i=0;i<obj.length;i++)
		{
			obj[i] = in.next();
		}
		System.out.println(Arrays.toString(obj));
		in.close();
		}
		
		 

	}
}
