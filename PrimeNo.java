import java.util.Scanner;


public class PrimeNo {

	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int primeno=s.nextInt();
		int flag=0;
		for(int i=2;i<primeno;i++){
			if(primeno%i==0){
				flag=1;
			}
			
		}
		if(flag==1){
			System.out.println("The number is not a prime");
		}
		else{
			System.out.println("the number is a prime number");
		}
		s.close();
	}

}
