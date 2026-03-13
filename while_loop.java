
public class while_loop {
	public static void main(String args[]) {
		//Problem01
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("Program exited");
		System.out.println();
		
		//Problem02
		int a=2;
		while(a<=10) {
			System.out.println(a);
			a+=2;
		}
		System.out.println();
		
		//Problem03
		int b = 0;
		while (b < 5) {
		  System.out.println(b);
		  b++;
		}
		System.out.println();
		
		//Problem04
		int countdown = 3;

		while (countdown > 0) {
		  System.out.println(countdown);
		  countdown--;
		}

		System.out.println("Happy New Year!!");
		System.out.println();
		
		
		//Problem05
		int c = 10;

		while (c < 5) {
		  System.out.println("This will never be printed");
		  c++;
		}
	}

}
