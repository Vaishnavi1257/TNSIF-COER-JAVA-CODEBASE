package SingledimensionDemo;

public class Student {

	private int rollNo;
	private Student Name;
	
	
	public Student(int rollNo, Student name) {
		super();
		this.rollNo = rollNo;
		this.Name = name;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public Student getName() {
		return Name;
	}


	public void setName(Student name) {
		Name = name;
	}

	
	
}
