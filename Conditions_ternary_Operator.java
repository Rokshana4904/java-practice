
public class Conditions_ternary_Operator {
	public static void main(String args[]) {
		//variable = (condition) ? expressionTrue :  expressionFalse;
		int time = 10;
		String result = (time < 18) ? "Good day." : "Good evening.";
		System.out.println(result);
		
		int day = 2;
		String results = (day==1) ? "Saturday." : "Sunday.";
		System.out.println(results);
	}

}
