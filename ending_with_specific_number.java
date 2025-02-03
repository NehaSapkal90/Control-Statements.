package Control_Statement_2;

public class ending_with_specific_number {

	public static void main(String[] args) {

		int start = 100;
		int end = 200;
		int endingElement = 7;
		
		for(int i=start; i<=end; i++) {
			if(i%10==endingElement) {
				System.out.println(i);
			}
		}

	}

}
