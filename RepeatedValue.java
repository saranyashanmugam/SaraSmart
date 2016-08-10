
import java.util.Scanner;

public class RepeatedValue {
  public static void main(String []args){
	  int arr[]=new int[50];
	  Scanner scr=new Scanner(System.in);
	  System.out.println("Enter the total numbers");
	  int n=scr.nextInt();
	  for(int i=0;i<n;i++){
		  arr[i]=scr.nextInt();
	  }
		  for(int j=0;j<n-1;j++){
			  if(arr[j]==arr[j+1]){
				  System.out.println(arr[j]);
			  }
		  }
		  
		  scr.close();
	  
  }
}
