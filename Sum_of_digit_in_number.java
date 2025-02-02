package Control_Statement_2;

public class Sum_of_digit_in_number {

	public static void main(String[] args) {
		int num = 24;
		
		
		int sum = 0;
		int rem = 0;
		while (num > 0) {
			rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("sum of digit : " + sum);

	}

}
