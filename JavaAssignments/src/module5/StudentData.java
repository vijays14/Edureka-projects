package module5;

/**
 * @author Sudha Vijayakumar
 *
 * Module 5  - Collections and Wrapper class Assignments
 */
public class StudentData {
	
	int StId;
	String StudentName;
	int StMarks;
	public StudentData(int stId, String studentName, int stMarks) {
		super();
		this.StId = stId;
		this.StudentName = studentName;
		this.StMarks = stMarks;
	}
	public int getStId() {
		return StId;
	}
	public void setStId(int stId) {
		StId = stId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStMarks() {
		return StMarks;
	}
	public void setStMarks(int stMarks) {
		StMarks = stMarks;
	}
	
	
	@Override
	public String toString()
	{
		return "Student Details : Student Id :" + this.StId + "| Student Name : " + this.StudentName + "| Student Marks : " + this.StMarks + "|";
	}
	
	
	

}
