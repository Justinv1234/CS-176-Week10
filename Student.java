public class Student {
	String ID;
	String name;
	int[] testScores = new int[100];
	
	public Student (String name, String ID) {
		this.name = name;
		this.ID = ID;
		for (int i = 0;i < testScores.length;i++) {
			testScores[i] = -1;
		}
	}
	
	public String getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}

	public int getScore(int testNum) {
		return testScores[testNum];
	}

	public void addNewScore(int testNum, int grade) {
		
		testScores[testNum] = grade;
	}
	
}
