
public class Conditions_else_if {
	public static void main(String args[]) {
		//Problem01
		int weather = 2; // 1 = raining, 2 = sunny, 3 = cloudy
		if (weather == 1) {
		  System.out.println("Bring an umbrella.");
		} 
		else if (weather == 2) {
		  System.out.println("Wear sunglasses.");
		} 
		else {
		  System.out.println("Just go outside normally.");
		}
		System.out.println();
		
		//Pronblem02
		int time = 16;

		if (time < 12) {
		  System.out.println("Good morning.");
		} 
		else if (time < 18) {
		  System.out.println("Good day.");
		} 
		else {
		  System.out.println("Good evening.");
		}
		System.out.println();
		
		//Problem03
		int day = 6;
		if(day==1) {
			System.out.println("Sunday");
		}
		else if(day==2) {
			System.out.println("Monday");
		}
		else if(day==3) {
			System.out.println("Tuesday");
		}
		else if(day==4) {
			System.out.println("Wednesday");
		}
		else if(day==5) {
			System.out.println("Thursday");
		}
		else if(day==6) {
			System.out.println("Friday");
		}
		else {
			System.out.println("Saturday");
		}
		System.out.println();
	}

}
