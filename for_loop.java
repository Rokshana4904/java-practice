
public class for_loop {
	public static void main(String args[]) {
		//Problem01
		for (int i=0; i<5; i++) {
			System.out.println(i);
		}
		System.out.println();
		
		//Problem02
		for (int i = 0; i <= 10; i = i + 2) {
			  System.out.println(i);
			}
		System.out.println();
		
		//Problem03
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
		  sum = sum + i;
		}
		System.out.println("Sum is " + sum);
		System.out.println();
		
		//Problem04
		for (int i = 5; i > 0; i--) {
			  System.out.println(i);
			}
		System.out.println();
		
		//problem05
		for (int i = 10; i < 5; i++) {
			  System.out.println("This will never be printed");
			}
	}

}

