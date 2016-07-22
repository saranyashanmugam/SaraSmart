public class NumberPalindrome {

	
	public static void main(String[] args) {
		StringBuffer a=new StringBuffer(args[0]);
		StringBuffer b=new StringBuffer();
		b=a.reverse();
		String k=new String(b);
		if(args[0].equals(k)){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not a Palindrome");
		}
		
	}

}
