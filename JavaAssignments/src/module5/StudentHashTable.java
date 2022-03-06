package module5;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class StudentHashTable {

	public static void main(String[] args) {

		try {

			Hashtable<Integer,StudentData> studentHash = new Hashtable<Integer,StudentData>();

			studentHash.put(100, new StudentData(1060,"Maria",95));
			studentHash.put(200, new StudentData(1061,"Martina hinges",99));
			studentHash.put(300, new StudentData(1062,"Roger Federer",97));
			studentHash.put(400, new StudentData(1063,"CR7",100));
			studentHash.put(500, new StudentData(1064,"Steffi",98));

			Iterator<Entry <Integer,StudentData>> studentItr = studentHash.entrySet().iterator();
			while(studentItr.hasNext())
			{
				Map.Entry<Integer, StudentData> Itrset = studentItr.next();
				System.out.println("Printing " + Itrset.getValue());
			}
			//finding the Max mark and display the Student name

			Collection <StudentData> sd = studentHash.values();
			List <Integer> stmarks = sd.stream().map(e-> e.getStMarks()).sorted().collect(Collectors.toList());

			Integer maxmarks = stmarks.get(stmarks.size()-1);


			System.out.println("Max marks = " + maxmarks);
			for(StudentData studentmarks : sd )
			{
				if (studentmarks.getStMarks()==maxmarks)
				{
					System.out.println("Student with Highest Marks - " + studentmarks);

				}

			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	}
