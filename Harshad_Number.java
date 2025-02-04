package newa;

public class Harshad_Number {

	public static void main(String[] args) {

		int number=200;
		
		int temp=number;
		int sum=0;
		int rem=0;
		
		while(number>0) {
			rem=number%10;
			sum=sum+rem;
			number = number/10;
		}
		if(temp%sum==0) {
			System.out.println("harshad number");
		}else {
			System.out.println("not harshad number");
		}
		
		
		
	}

}
