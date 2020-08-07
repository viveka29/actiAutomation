package dataTypesDemo;

public class arraydemo {

	public static void main(String[] args) {

		int a[] = new int[5];
		a[0] = 5;
		a[1] = 10;
		a[2] = 15;
		a[3] = 20;
		a[4] = 25;
		
		System.out.println(a[0]);
		System.out.println("size of array" + a.length);
		
		for(int i =0;i <a.length; i++)
			System.out.println(a[i]);
		
		String s[] = new String[5];
		s[0] = "Viveka";
		s[1] = "Radhika";
		s[2] = "Rakesh";
		s[3] = "hello";
		s[4] = "ewrwe";
		
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		for(int i =0 ; i < s.length ; i++)
			System.out.println(s[i]);
		
	}

}
