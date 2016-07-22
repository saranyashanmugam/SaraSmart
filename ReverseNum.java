import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String n=scr.next();
		StringBuffer a=new StringBuffer(n);
		StringBuffer b=new StringBuffer();
		b=a.reverse();
		String k=new String(b);
		int c=Integer.parseInt(k);
		System.out.println(c);
		scr.close();
	}

}
