public class CourseTester {
	
	public static void main(String[] args) {
		Course cs176l = new Course("cs176l","Computer science", "undergraduate");
		cs176l.addStudent("Cream","0000001");  // name and id
		cs176l.addGrade("0000001", 1, 98);  // add the grade 98 of student with id 00000001 of test 1.
		cs176l.addStudent("Oreo","0000002");  // name and id
		cs176l.addGrade("0000002", 1, 99);  // add the grade 99 of student with id 00000002 of test 1.
		cs176l.printGrade(1); // print the result of test 1:   we will see :   Cream 98, Oreo 99
		cs176l.sortGrade(1); // sorting based on descending order, so 99 first, then 98
		System.out.println("\n");
		cs176l.printGrade(1); // print the result of test 1:   we will see:  Oreo 99, Cream 98 on your screen.
		System.out.println("\n");
		cs176l.updateGrade("0000001", 100); 
		cs176l.printGrade(1); // print the result of test 1:   we will see:  Oreo 99, Cream 100 on your screen.
		System.out.println("\n");
		cs176l.sortGrade(1); // sorting based on descending order, so 100 first, then 99
		cs176l.printGrade(1); // print the result of test 1:   we will see: Cream 100, Oreo 99 on your screen.
		System.out.println("\n");
		cs176l.addGrade("0000003", 2, 88); // Error, no student with id ‘0000003’ registered in this class.
		cs176l.addStudent("Derek","0000003");
		cs176l.addGrade("0000003", 2, 88); // Good.
		System.out.println("\n");
		cs176l.printGrade(2); // Derek 88.
	}

}
