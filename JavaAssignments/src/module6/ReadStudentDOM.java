package module6;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * @author Sudha Vijayakumar
 *
 * Module 6  - XML and DOM , SAX parser Assignments
 */
public class ReadStudentDOM {

	public static void main(String[] args) {


		File myfile = new File("C:\\Edureka\\Eclipse-Workspace\\JavaAssignments\\src\\module6\\Students.xml");



		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

		try {
			//Get Document Builder object
			DocumentBuilder docbuilder = factory.newDocumentBuilder();
			//Build Document - this is used to get the Document structure of the XML
			Document document = docbuilder.parse(myfile);
			// the below code helps to print root element
			document.getDocumentElement().normalize();
			System.out.println("Root Element :" + document.getDocumentElement().getNodeName());
			//Get Node list
			NodeList nodelist = document.getElementsByTagName("Student");

			//Get each element from the Node list (as this Node list is an interface, we are using iterator)

			for(int  i = 0; i<nodelist.getLength() ; i++)
			{
				Node node = nodelist.item(i);
				System.out.println("Current Element : "+ node.getNodeName() +"-"+ (i+1));
				System.out.println("*****************************");						 
				//type casting the Node as Element to get each element in the XML

				if(node.getNodeType()==Node.ELEMENT_NODE) 
				{
					Element element = (Element) node;
					System.out.println("Student ID : " + element.getAttribute("id"));

					printTextContext("Name", element);
					printTextContext("Standard",element);
					printTextContext("Gender",element);
					System.out.println("Marks : ");
					printTextContext("First_Sem_Marks",element);
					printTextContext("Second_Sem_Marks",element);
					printTextContext("Third_Sem_Marks",element);
					System.out.println("Address : ");
					printTextContext("State",element);
					printTextContext("City",element);
					System.out.println("*****************************");
				}

			}
		} catch (ParserConfigurationException | SAXException | IOException e) 
		{
			e.printStackTrace();
		}

	}
	//Extract method - use Refractor option to get Extract method
	private static void printTextContext(String tagName,Element element) {
		System.out.println(tagName +" : "+ element.getElementsByTagName(tagName).item(0).getTextContent());
	}



}
