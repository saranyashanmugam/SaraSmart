package guvi.beginnerslevel;

import java.util.Scanner;

public class SwapTwoNum {

	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the two numbers for swapping");
		int n1=scr.nextInt();
		int n2=scr.nextInt();
		int temp;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swapping of n1 and n2  "+n1+" "+n2);

	}

}
