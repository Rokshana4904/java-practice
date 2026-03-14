
public class nested_loops {
	public static void main(String args[]) {
		//Problem01
		for(int i=1; i<=5; i++) {
			System.out.println("Outer: " +i);
			for(int j=1; j<=3; j++) {
				System.out.println("Inner: "+j);
			}
			System.out.println();
		}
		System.out.println();
		
		//Problem02
		for (int i = 1; i <= 3; i++) {
			  for (int j = 1; j <= 3; j++) {
			    System.out.print(i * j + " ");
			  }
			  System.out.println();
			}
	}

}
