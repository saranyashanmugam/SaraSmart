package guvi.beginnerslevel;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the Year");
		int year=scr.nextInt();
		if(year%4==0){
			System.out.println("The given Year is a Leap Year");
		}
		else{
	System.out.println("The given Year is not a Leap Year");
}
	}

}
