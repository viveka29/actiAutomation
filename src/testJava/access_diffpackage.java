package testJava;
import dataTypesDemo.accessprivatepub;

public class access_diffpackage extends accessprivatepub {

	public static void main(String[] args) {
		
		accessprivatepub obj3=new accessprivatepub();
		obj3.c = 50;
			
		System.out.println(obj3.c);
	}

}
