
public class Conditonal_Statement_if_else {
	public static void main(String args[]) {
		//Problem1
		int age=15;
		if(age>=18) {
			System.out.println("Eligible for vote");
		}
		else {
			System.out.println("Not eligible for vote");
		}
		System.out.println();
		
		//Problem2
		boolean isRaining = false;
		if(isRaining) {
			System.out.println("Bring an umbrella!");
		}
		else {
			System.out.println("Not bring an umbrella!");
		}
		System.out.println();
		
		//Problem3
		if(20>18) {
			System.out.println("20 is greater than 18");
		}
		System.out.println();
		
		//Problem4
		int x = 20;
		int y = 18;
		if (x > y) {
		  System.out.println("x is greater than y");
		}
		else {
			System.out.println("y is greater than x");
		}
		System.out.println();
		
		//Problem5
		int a = 20;
		int b = 20;
		if (a == b) {
		  System.out.println("a is equal to b");
		}
		System.out.println();
		
		//Problem6
		int time = 20;
		if (time < 18) {
		  System.out.println("Good day.");
		} else {
		  System.out.println("Good evening.");
		}
	}
}
