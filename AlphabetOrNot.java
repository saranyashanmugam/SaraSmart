
import java.util.Scanner;

public class AlphabetOrNot {

	public static void main(String[] args) {
		Scanner scr=new  Scanner(System.in);
		char c= scr.next().charAt(0);
		if(c>=(char)65&&c<=(char)90||c>=(char)97&&c<=(char)122){
			System.out.println("The given character is an alphabet");
		}else{
		System.out.println("The given character is not an alaphabet");
		}
		
	}

}
