package dataTypesDemo;

public class InstanceVariableDemo {
	
	int engMarks;
	int phyMarks;
	int mathMarks;

	public static void main(String[] args) {

		InstanceVariableDemo student1 = new InstanceVariableDemo();
		
		student1.engMarks = 30;
		student1.mathMarks = 40;
		student1.phyMarks = 50;
		
		System.out.println(student1.engMarks);
		System.out.println(student1.mathMarks);
		System.out.println(student1.phyMarks);
		
		InstanceVariableDemo student2 = new InstanceVariableDemo();
		
		student2.engMarks = 60;
		student2.mathMarks =70;
		student2.phyMarks = 80;
		
		System.out.println(student2.engMarks);
		System.out.println(student2.mathMarks);
		System.out.println(student2.phyMarks);
		
	}

}
