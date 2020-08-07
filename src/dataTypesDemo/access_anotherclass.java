package dataTypesDemo;

public class access_anotherclass {

	public static void main(String[] args) {

		accessprivatepub obj2 = new accessprivatepub();
		obj2.b =60;
		obj2.c = 70;
		obj2.d = 80;
		
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		System.out.println(obj2.d);
	}

}
