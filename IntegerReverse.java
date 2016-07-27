import java.util.Scanner;

public class IntegerReverse {
 public static void reverse(String input1) throws NumberFormatException{
	 StringBuffer sb=new StringBuffer(input1);
	   sb=sb.reverse();
	   String s=sb.toString();
	   int reversedValue=Integer.parseInt(s);
	   System.out.println("Reversed String:"+reversedValue);
 }
	public static void main(String[] args) {
		try{
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the number");
		reverse(scr.nextLine());
        scr.close();
		}
		catch(NumberFormatException e){
			System.out.println(e.getClass().getName());
		}
	}
}
