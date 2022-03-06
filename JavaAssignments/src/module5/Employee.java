package module5;

/**
 * @author Sudha Vijayakumar
 *
 * Module 5  - Collections and Wrapper class Assignments
 */
public class Employee {

	int Empid;
	String EmpName;
	String Role;
	double empSal;
	
	public Employee(int empid, String empName, String role, double empSal) {
		super();
		Empid = empid;
		EmpName = empName;
		Role = role;
		this.empSal = empSal;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}

	
	@Override
	public String toString()
	{
		
		return "Employee Id : " + this.Empid +" | Employee Name : " + this.EmpName + "| Employee Role : " +this.Role + "| Employee Salary : "
				+ this.empSal + "|";
	}
	
	
	
	

}
