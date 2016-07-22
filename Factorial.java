import java.util.Scanner;


public class Factorial {
    public int factorial(int n){
    	if(n==0)
    		return 1;
    	n=n*factorial(n-1);
    	return n;
    }
	public static void main(String[] args) {
		 Factorial  f=new  Factorial ();
		 Scanner s=new Scanner(System.in);
		 int n=Math.abs(s.nextInt());
		 int factorialValue=f.factorial(n);
		 System.out.println(factorialValue);
		 s.close();
	}

}
