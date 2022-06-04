package S3D1_Abstraction_Interface;

abstract  class Student {

	abstract int getPercentage();
	String name;
	String address;
	
}

class ScienceStudent extends Student{

	int phisicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	@Override
	 int getPercentage() {
		
		return ((phisicsMarks+chemistryMarks+mathsMarks)*100)/300;
	}
	
	ScienceStudent(String Name, String Address, int PhysicsMarks, int ChemistryMarks, int MathsMarks){
		this.name = Name;
		this.address = Address;
		this.phisicsMarks = PhysicsMarks;
		this.chemistryMarks = ChemistryMarks;
		this.mathsMarks = MathsMarks;
	}

}

class HistoryStudent extends Student{

	int historyMarks;
	int civicsMarks;
	
	@Override
	int getPercentage() {
		
		return ((historyMarks+civicsMarks)*100)/200;
	}
	
	HistoryStudent(String Name, String Address, int HistoryMarks, int CivicsMarks){
		this.name = Name;
		this.address = Address;
		this.historyMarks = HistoryMarks;
		this.civicsMarks = CivicsMarks;
	}
}































