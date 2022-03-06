package module5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author Sudha Vijayakumar
 *
 * Module 5  - Collections and Wrapper class Assignments
 * 
 * Write a program to write 5 employee records using HashMap and display them
 */
public class EmployeeHashMap {

	
	public static void main(String[] args) {
		
		try {
	
		HashMap<Integer,Employee> EmployeeMap = new HashMap<Integer,Employee>();

		EmployeeMap.put(31,new Employee(1001,"John","Front End - Developer",35000));
		EmployeeMap.put(24,new Employee(1004,"Smith","Team Lead",85000));
		EmployeeMap.put(95,new Employee(1005,"Tracy","Scrum Master",30000));
		EmployeeMap.put(102,new Employee(1002,"Mike","QA Engineer",45000));
		EmployeeMap.put(73,new Employee(1003,"Olivia","Developer",55000));
		
		System.out.println("=== Traversing Map with entrySet() method ===");
		
		Set <Entry<Integer,Employee>> empset = EmployeeMap.entrySet();
		for (Entry<Integer,Employee> es : empset)
		{
			System.out.println("Print Employee data : Key " + es.getKey() + " : " + es.getValue());
		}
		
		System.out.println("=== Traversing Map with Iterator ===");
		
		
		Iterator<Entry<Integer,Employee>> Itr = EmployeeMap.entrySet().iterator();
		
		while(Itr.hasNext())
		{
			Map.Entry<Integer, Employee> Itrset = Itr.next();
			System.out.println("Printing Emp data : Key = " + Itrset.getKey() +" | "+ Itrset.getValue());
			
		}
		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

	
}
