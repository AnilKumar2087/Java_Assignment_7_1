package assignment7_1;

import java.util.Scanner;

public class Int_To_String {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		System.out.println("Enter any number");
		
		Scanner sc =new Scanner(System.in);
		
		int number=0;
		String str="";
		
		number = sc.nextInt();
		
		//converting int to string
		
		str = String.valueOf(number);
		
		System.out.println(str);
	}

}
