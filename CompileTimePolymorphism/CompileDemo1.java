package CompileTimePolymorphism;

public class CompileDemo1 {
	
	public static void main(String[] args) {
		
		CompileDemo1 obj1 = new CompileDemo1();
		obj1.add(45, 45);
		obj1.add(45.50, 45.50);
		obj1.add(78, 89, 45);
	}
	public void add(double a, double b) {
		
		double c = a+b;
		System.out.println("Sum of numbers is "+c);
	}
	public void add(int a, int b) {
		
		int c = a+b;
		System.out.println("Sum of numbers is "+c);
	}
	public void add(int a, int b, int d) {
		
		int c = a+b+d;
		System.out.println("Sum of numbers is "+c);
	}
}
