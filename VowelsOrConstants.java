import java.util.Scanner;

public class VowelsOrConstants {

	public static void main(String[] args) {
	Scanner scr=new Scanner(System.in);
	System.out.println("Enter the character");
	char a=scr.next().charAt(0);
	if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
		System.out.println("The given character is vowels");
	}else {
		System.out.println("The given character is consonants");
	}
scr.close();
}
