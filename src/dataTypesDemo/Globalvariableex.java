package dataTypesDemo;

public class Globalvariableex {
	
	int engmarks;
	int mathmarks;
	int sciencemarks;
	
	public static void main(String[] args) {
		
		Globalvariableex student1 =new Globalvariableex();
	    student1.engmarks = 30;
	    student1.mathmarks = 40;
	    student1.sciencemarks = 50;
	    
	    System.out.println(student1.engmarks);
	    System.out.println(student1.mathmarks);
	    System.out.println(student1.sciencemarks);
	    
	    Globalvariableex student2= new Globalvariableex();
	    student2.engmarks =60;
	    student2.mathmarks =70;
	    student2.sciencemarks = 50;
	    
	    System.out.println(student2.engmarks);
	    System.out.println(student2.mathmarks);
	    System.out.println(student2.sciencemarks);

		
	}

}
