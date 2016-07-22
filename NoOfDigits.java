import java.util.Scanner;


public class NumberOfDigits {

	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=Math.abs(scr.nextInt());
		int count=0;
		count=String.valueOf(number).length();
        System.out.println("The number of digits in a given  number "+count);
        scr.close();
	}

}
