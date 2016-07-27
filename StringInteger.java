package guvi.playerlevel;

import java.util.Scanner;

public class StringIntegerConversion {

	public static void main(String[] args) {
		try{
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the String");
	String a=scr.nextLine();
	int value=Integer.parseInt(a);
	System.out.println(value);
	}
		catch(NumberFormatException e){
			System.out.println(e.getClass().getName());
		}
}
}
