package Control_Statement_2;

public class factorial_of_a_number {

	public static void main(String[] args) {
		int num = 5;

		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println(fact);
	}

}
