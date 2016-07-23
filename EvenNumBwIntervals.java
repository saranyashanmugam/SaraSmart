
import java.util.Scanner;

public class EvenNumBwIntervals {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the Range");
		int n1=scr.nextInt();
		int n2=scr.nextInt();
		while(n1<=n2){
			if(n1%2!=0){
				System.out.print(n1+" ");
			}
			n1++;
		}

	}

}
