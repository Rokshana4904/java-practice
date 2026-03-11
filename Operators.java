
public class Operators {
	public static void main(String args[]) {
		//Arithmetic operators
		int a = 10;
		int b = 20;
		System.out.println(a+b);
		System.out.println(b-a);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(++a);
		System.out.println(--a);
		System.out.println(++b);
		System.out.println(--b);
		double c = 10.0d;
		double d = 3.0d;
		System.out.println(c/d);
		System.out.println();
		
		//Relation operator (Returns boolean value true and false)
		System.out.println(a<b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println();
		
		//Logical Operators (Returns boolean value true and false)
		System.out.println(a<5 && b<10); 
		System.out.println(a<15 && b<10);
		System.out.println(a<5 && b<25);
		System.out.println(a<15 && b<25);
		System.out.println();
		System.out.println(a<5 || b<10);
		System.out.println(a<15 || b<10);
		System.out.println(a<5 || b<25);
		System.out.println(a<15 || b<25);
		System.out.println();
		System.out.println(!(a<5 && b<10));
		System.out.println(!(a<15 && b<25));
		System.out.println();
		
		//Assignment Operators
		int x;
		x=a;
		System.out.println(x);
		x += 5;
		System.out.println(x);
		x -= 2;
		System.out.println(x);
		x *= 2;
		System.out.println(x);
		x /= 2;
		System.out.println(x);
		x %= 3;
		System.out.println(x);
		System.out.println();
		x &= 2;
		System.out.println(x);
		x |= 2;
		System.out.println(x);
		x ^= 5;
		System.out.println(x);
		x >>= 5;
		System.out.println(x);
		x <<= 5;
		System.out.println(x);
		System.out.println();
		
	}

}
