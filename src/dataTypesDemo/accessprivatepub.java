package dataTypesDemo;

public class accessprivatepub {
	
	private int a;
	int b;
	public int c;
	protected int d;

	public static void main(String[] args) {
		
		accessprivatepub obj1= new accessprivatepub();
		obj1.a =10;
		obj1.b = 20;
		obj1.c = 30;
		obj1.d = 40;
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);

	}

}
