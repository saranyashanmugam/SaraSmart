import java.util.Scanner;

public class StringReverse {
   public static void reverse(String input1){
	   StringBuffer sb=new StringBuffer(input1);
	   sb=sb.reverse();
	   String s=sb.toString();
	   System.out.println("Reversed String:"+s);
   }
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter the String");
		reverse(scr.nextLine());
        scr.close();
	}

}
