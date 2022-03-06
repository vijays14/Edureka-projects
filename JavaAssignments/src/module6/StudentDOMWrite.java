package module6;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.Text;

/**
 * @author Sudha Vijayakumar
 *
 * Module 6  - XML and DOM , SAX parser Assignments
 */
public class StudentDOMWrite {

	public static void main(String[] args) throws Exception {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//Get Builder object
		DocumentBuilder builder = factory.newDocumentBuilder();
		//Get Document Object
		
		Document document = builder.newDocument();
		
		//Get Root element
		Element rootElmt = document.createElement("Students_Data");
		//Get Branch element
		Element branchElmt = document.createElement("Student");
		//set attribute to the branch element
		Attr attr = document.createAttribute("Id");
		
		//Get leaves element
		Element nameElmt = document.createElement("Name");
		Element stdElmt = document.createElement("Standard");
		Element genderElmt = document.createElement("Gender");
		Element marksElmt = document.createElement("Marks");
		Element firstsemElmt = document.createElement("First_Sem_Marks");
		Element secondsemElmt = document.createElement("Second_Sem_Marks");
		Element thirdsemElmt = document.createElement("Third_Sem_Marks");
		Element addressElmt = document.createElement("Address");
		Element stateElmt = document.createElement("State");
		Element cityElmt = document.createElement("City");
		
		
		String[] stnames = {"Emma","James","Olivia","Daniel","Sophia","Zack"};
		String[] std = {"5","6","7","5","6","5"};
		String [] gen = {"Female","Male","Female","Male","Female","Male"};
		String[][] marks = {{"87","88","80"},{"95","85","92"},{"99","98","97"},{"96","94","92"},{"90","97","91"},{"99","100","100"}};
		String [][] address = {{"NewYork","Amsterdam"},{"NewYork","Buffalo"},{"Virginia","Richmond"},{"California","Los Angeles"},{"California","San Diego"},
				{"NewYork","Newark"}
		};
		
		//Create Text element
		
		Text nametext =null;
		  Text stdtext =null;
		 Text gentext =null;
		 Text marktext =null;
		 Text addtext=null;
		
		for (int i = 0; i< stnames.length;i++)
		{
			 nametext = document.createTextNode(stnames[i]);
			   stdtext = document.createTextNode(std[i]); 
			  gentext =  document.createTextNode(gen[i]);
			  
			   for (int j = 0 ; j<marks[i].length; j++) 
			   {
			  marktext = document.createTextNode(marks[i][j]); 
			  			  
			  } 
			  for(int j = 0 ; j<address[i].length;j++) {
			  
			  addtext = document.createTextNode(address[i][j]);
			   
			   }
			 
		}
			
		
		addressElmt.appendChild(stateElmt);
		addressElmt.appendChild(cityElmt);
		
		marksElmt.appendChild(firstsemElmt);
		marksElmt.appendChild(secondsemElmt);
		marksElmt.appendChild(thirdsemElmt);
		//Append Child elements
		
		
		nameElmt.appendChild(nametext);
		stdElmt.appendChild(stdtext);
		genderElmt.appendChild(gentext);
		stateElmt.appendChild(addtext);
		cityElmt.appendChild(addtext);
		firstsemElmt.appendChild(marktext);
		secondsemElmt.appendChild(marktext);
		thirdsemElmt.appendChild(marktext);
		System.out.println(nametext);
		
		
		
		
		
			
		}
		
		
		

	}


