package dataTypesDemo;

public class StaticKeywordex {
	
	String custname;
	int accountno;
	double salary;
	static String bankname = "HSBC";	
	
	public static void main(String[] args) {
	StaticKeywordex accountdet = new StaticKeywordex();
	
	accountdet.custname ="viveka";
	accountdet.accountno = 12345;
	accountdet.salary = 8666.36;
	
	System.out.println(accountdet.custname);
	System.out.println(accountdet.accountno);
	System.out.println(accountdet.salary);
	
	System.out.println(StaticKeywordex.bankname);
	
	StaticKeywordex cust2= new StaticKeywordex();
	cust2.custname = "Viraat";
	cust2.accountno = 2352352;
	cust2.salary = 134325.453;
	System.out.println(cust2.custname);
	System.out.println(cust2.accountno);
	System.out.println(cust2.salary);
	

		
	}

}
