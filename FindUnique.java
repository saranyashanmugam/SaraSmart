
import java.util.Scanner;

public class FindUnique {
  public static void main(String[] args){
	  Scanner scr=new Scanner(System.in);
	  System.out.println("enter the size of an array");
	  int n=scr.nextInt();
	  int a[]=new int[n];
	  System.out.println("Enter the array elements");
	  for(int i=0;i<n;i++){
		  a[i]=scr.nextInt();
	  }
	  for(int j=0;j<n-1;j++){
			  if((a[j]==a[j+1])){
				  a[j]='\0';
				  a[j+1]='\0';
		  }
		  }
		  for(int i=0;i<n;i++){
			  if(a[i]!='\0'){
				  System.out.println(a[i]);
			  }
		  }
		  scr.close();
	  }
  }

