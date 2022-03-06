package module6;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 * @author Sudha Vijayakumar
 *
 * Module 6  - XML and DOM , SAX parser Assignments
 */
public class ReadStudentUsingSAX  extends DefaultHandler{

	
	
	@Override
	public void startDocument() {
		System.out.println(" ********* Start Reading the Student XML ********* ");
	}
	
	@Override
	public void startElement(String uri, String tagname, String value,Attributes attribute)
	{
		System.out.print("<"+value+">");
		
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
	{
		String data = new String(ch,start,length);
		System.out.print(data);
		
	}
	@Override
	public void endElement(String uri, String tagname, String value)
	{
		System.out.print("</"+value+">");
		
	}
	
	@Override
	public void endDocument() {
		System.out.println("\n ********* End of Student XML **********");
	}
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		File myfile = new File("C:\\Edureka\\Eclipse-Workspace\\JavaAssignments\\src\\module6\\Students.xml");
		
		ReadStudentUsingSAX readstudentSAX = new ReadStudentUsingSAX();
		
		SAXParser saxparser = SAXParserFactory.newInstance().newSAXParser();
		saxparser.parse(myfile,readstudentSAX );
		

	}

}
