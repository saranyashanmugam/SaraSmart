
import java.util.Scanner;

public class RandomNumber {

	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the range upto which the random number wants to generate");
		int n=scr.nextInt();
		 n=(int)(Math.random()*n+1);
		 System.out.println(n);
	}

}
