
public class break_continue_statement {
	public static void main(String args[]) {
		//Break
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.println("Print the all value of i: " +i);
		}
		System.out.println();
		
		//Continue
		for(int i=1; i<=10; i++) {
			if(i==5) {
				continue;
			}
			System.out.println("Print the all value of i: " +i);
		}
		
	}

}
