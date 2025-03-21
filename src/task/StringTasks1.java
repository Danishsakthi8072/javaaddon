package task;

import java.util.Scanner;

public class StringTasks1 {
	public static void main(String args[]) {
		
		
	{	
	Scanner in = new Scanner(System.in);
	String str;
	System.out.println("Enter the Sentence:");
	str = in.nextLine();
	char[] ch= {'a','e','i','o','u'};
	char[] arr=str.toCharArray();
	//	str=str.toLowerCase();
	int count=0;
	for(int i=0;i<str.length();i++){
		for(int j=0;j<ch.length;j++) {
			if(arr[i]==ch[j])
				count++;
		}
//		char ch=str.charAt(i);
//		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
//			count++;
//			System.out.println(ch+ " ");
//		}	
	System.out.println(count);
	}
	in.close();
		}	
	}	
}


		
