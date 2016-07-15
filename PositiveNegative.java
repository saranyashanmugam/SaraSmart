import java.io.lang;

public class PositiveNegative {

	
	public static void main(String[] args) {
		int a= Integer.parseInt(args[0]);
		System.out.println(args.length);
		if(a==0){
			System.out.println("0 IS EITHER POSITIVE OR NEGATIVE");
		}
		else if(a>0){
			System.out.println("The number is positive");
		}
		else{
			System.out.println("The number is negative");
		}

	}

}
