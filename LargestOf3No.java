import java.util.Scanner;

public class LargestOf3No {

	
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the 3 Numbers");
		int a=scr.nextInt();
		int b=scr.nextInt();
		int c=scr.nextInt();
		if(a>b&&a>c){
			System.out.println("First number is bigger");
		}
		else if(b>c){
			System.out.println("Second number is bigger");
		}
		else{
			System.out.println("Third number is bigger");
		}
		scr.close();
	}

}
