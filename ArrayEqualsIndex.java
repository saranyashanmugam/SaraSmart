import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqualsIndex {
  public static void  main(String[] args){
	  Scanner scr=new Scanner(System.in);
	  int n=scr.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++){
		  arr[i]=scr.nextInt();
	  }
	  for(int j=0;j<n-1;j++){
		  if(!(arr[j]==arr[j+1])){
			  Arrays.sort(arr);
			  if(j==arr[j]){
				  System.out.println(arr[j]);
			  }
		  }
		  else{
			  System.out.println("Enter the unique values");
		  }
		 
	  }
	  scr.close();
  }
}
