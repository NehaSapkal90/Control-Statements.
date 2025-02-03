package Control_Statement_2;

public class Number_is_palindrome_or_not {

	public static void main(String[] args) {
		
		
		int num = 121;
		int temp = num;
		int rem;
		int rev=0;
		while(num>0) { 
			rem = num%10; 
			rev = rev*10+rem; 
			num = num/10; 
			
			
		}
		System.out.println(rev);
		if(temp == rev) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}

	}

}
