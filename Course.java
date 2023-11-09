import java.util.ArrayList;

public class Course {
	String courseCode;
	String courseName;
	String level;
	ArrayList<Student> allStudents = new ArrayList<Student>();
	

	
	public Course(String courseCode, String courseName, String level) {
		this.courseCode = courseCode;
		this.courseName = courseName;
		this.level = level;
	}

	public void addStudent(String name, String ID) {
		allStudents.add(new Student(name, ID));
	}

	public void addGrade(String ID, int testNum, int grade) { //(”0000001”, 1, 98);  // add the grade 98 of student with id 00000001 of test 1.
		for(Student student: allStudents) {
			if(student.getID().equals(ID)) {
				student.addNewScore(testNum, grade);
				return;
			}
		}
		System.out.println("Error, no student with id " + ID +" registered in this class.");
	}

	public void printGrade(int testNum) {
		for (Student student: allStudents) {
			if (student.getScore(testNum) != -1) { //if score exists
				System.out.println(student.getName() + ": " + student.getScore(testNum));
			}
		}
	}

	public void sortGrade(int testNum) {
		Student temp;
		for (int i = 0;i < allStudents.size();i++) {
			for (int j = i+1; j < allStudents.size();j++) {
				if (allStudents.get(i).getScore(testNum) < allStudents.get(j).getScore(testNum)) {
					temp = allStudents.get(i);
					allStudents.set(i, allStudents.get(j));
					allStudents.set(j, temp);
					i--;
				}
			}
		}
	}

	public void updateGrade(String ID, int newGrade) {
		for(Student student: allStudents) {
			if(student.getID().equals(ID)) {
				student.testScores[1] = newGrade; //Since you didnt give a specific test score to change I assume you meant the first test :)
				return;
			}
		}
	}

}



