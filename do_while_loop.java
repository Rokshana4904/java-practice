
public class do_while_loop {
	public static void main(String args[]) {
		//Problem01
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}while(i<=10);
		System.out.println();
		
		//Problem02
		int a=10;
		do {
			System.out.println(a);
			a++;
		}while(a<5);
		System.out.println();
		
		//Problem
		int odd=1;
		do
		{
			System.out.println("The odd number is: " +odd);
			odd+=2;
		}
		while(odd<=10);
		System.out.println();
	}

}
