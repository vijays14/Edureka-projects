package module6;

import java.io.File;
import java.io.FileNotFoundException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;

import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;


import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;


/**
 * @author Sudha Vijayakumar
 *
 * Module 6  - XML and DOM , SAX parser Assignments
 */
public class EmployeeWriteDOM {

	public static void main(String[] args) throws ParserConfigurationException, TransformerFactoryConfigurationError, FileNotFoundException, TransformerException {


		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		//Get Builder object
		DocumentBuilder builder = factory.newDocumentBuilder();
		//Get Document Object

		Document document = builder.newDocument();

		//Get Root element
		Element rootElmt = document.createElementNS("Module6 Assignment", "Employees");

		rootElmt.appendChild(createEmployee(document,"1093","Kristy Abott","Human Resource"));
		rootElmt.appendChild(createEmployee(document,"1094","John Gibson","Finance"));
		rootElmt.appendChild(createEmployee(document,"1108","Douglus deborah","Fire and Safety"));
		rootElmt.appendChild(createEmployee(document,"1115","Ryan Amig","Food"));
		rootElmt.appendChild(createEmployee(document,"1256","Tom Turner","Logistics"));

		document.appendChild(rootElmt);



		//Writing as XML

		TransformerFactory transfactory = TransformerFactory.newInstance();
		Transformer transformer = transfactory.newTransformer();

		DOMSource source = new DOMSource(document);

		File myFile = new File("C:\\Edureka\\Eclipse-Workspace\\JavaAssignments\\src\\module6\\Employees.xml");

		StreamResult file = new StreamResult(myFile);

		transformer.transform(source, file);

		System.out.println("Employee XML generated Successfully!");

	}
	private static Node createEmployee(Document document, String id, String  Name, String Department)
	{

		Element employee = document.createElement("Employee");

		employee.setAttribute("id", id);
		employee.appendChild(createEmplElement(document, "Name", Name));
		employee.appendChild(createEmplElement(document, "Department", Department));


		return employee;
	}

	private static Node createEmplElement(Document document, String name,String value) 
	{

		Element node = document.createElement(name);
		node.appendChild(document.createTextNode(value));

		return node;
	}



}
