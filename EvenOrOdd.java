import java.util.Scanner;

public class EvenOrOdd {

	
	public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	int number=scr.nextInt();
	number=Math.abs(number);
	if(number!=0){
		if(number%2==0){
			System.out.println("Number is even");
		}
		else if(number%2==1){
			System.out.println("Number is odd");
		}
		else{
			System.out.println("Number is Zero");
		}
	}
	scr.close();
	}

}
