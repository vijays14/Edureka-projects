package module5;

/**
 * @author Sudha Vijayakumar
 *
 * Module 5  - Collections and Wrapper class Assignments
 */
public class AllWrapper {

	public static void main(String[] args) {

		System.out.println("=========== 1.Integer Wrapper Class ==========");

		int i = 60;
		Integer I = i; //Auto boxing
		System.out.println("Printing int "+ i + " to Integer - Auto boxing : " + I);
		//Other Ways of declaring Integer

		Integer I2 = 55;
		Integer I3 = new Integer (40);
		Integer I4 = Integer.parseInt("89"); //parsing a String to Integer
		System.out.println("Parsing String to Integer : " + I4);
		System.out.println("UnBoxing Integer to int : " + I3.intValue());
		System.out.println("UnBoxing Integer to byte : " + I3.byteValue());
		System.out.println("UnBoxing Integer to double : " + I3.doubleValue());
		System.out.println("UnBoxing Integer to float : " + I3.floatValue());
		System.out.println("UnBoxing Integer to String : " + I3.toString());
		System.out.println("UnBoxing Integer to Hashcode : " + I3.hashCode());
		System.out.println("***********************************");

		System.out.println("=========== 2.Double Wrapper Class ==========");

		double d = 60.89;
		Double D = d;
		System.out.println("Printing double "+ d + " to Double - Auto boxing : " + D);
		//Other Ways of declaring Integer

		Double D2 = 34.78;
		Double D3 = new Double (343.789);
		Double D4 = Double.parseDouble("45435.567657"); //parsing a String to Double
		System.out.println("Parsing String to Double : " + D4);
		System.out.println("UnBoxing Double "+ D3 + " to int : " + D3.intValue());
		System.out.println("UnBoxing Double "+ D3 + " to byte : " + D3.byteValue());
		System.out.println("UnBoxing Double "+ D3 + " to double : " + D3.doubleValue());
		System.out.println("UnBoxing Double "+ D3 + " to float : " + D3.floatValue());
		System.out.println("UnBoxing Double "+ D3 + " to String : " + D3.toString());
		System.out.println("UnBoxing Double "+ D3 + " to Hashcode : " + D3.hashCode());
		System.out.println("***********************************");

		System.out.println("===========3. Byte Wrapper Class ==========");

		byte b = 60;
		Byte B = b;
		System.out.println("Printing byte "+ b + " to Byte - Auto boxing : " + B);
		//Other Ways of declaring byte

		Byte B2 = 127;
		Byte B3 = new Byte((byte) 107);
		Byte B4 = Byte.parseByte("46"); //parsing a String to Byte
		System.out.println("Parsing String to Byte : " + B4);
		System.out.println("UnBoxing Byte "+ B3 + " to int : " + B3.intValue());
		System.out.println("UnBoxing Byte "+ B3 + " to byte : " + B3.byteValue());
		System.out.println("UnBoxing Byte "+ B3 + " to double : " + B3.doubleValue());
		System.out.println("UnBoxing Byte "+ B3 + " to float : " + B3.floatValue());
		System.out.println("UnBoxing Byte "+ B3 + " to String : " + B3.toString());
		System.out.println("UnBoxing Byte "+ B3 + " to Hashcode : " + B3.hashCode());
		System.out.println("***********************************");
		
		
		System.out.println("=========== 4. Character Wrapper Class ==========");

		char ch = 'p';
		Character CH = ch;
		System.out.println("Printing char "+ ch + " to Character - Auto boxing : " + CH);
		//Other Ways of declaring byte

		Character Ch2 = 'w';
		Character Ch3 = new Character ('T');
		
		System.out.println("UnBoxing Character "+ Ch3 + " to char : " + Ch3.charValue());
		System.out.println("UnBoxing Character "+ Ch3 + " to String : " + Ch3.toString());
		System.out.println("UnBoxing Character "+ Ch3 + " to Hashcode : " + Ch3.hashCode());
		
		System.out.println("***********************************");
		
		System.out.println("=========== 5. Boolean Wrapper Class ==========");

		boolean bool = false;
		Boolean Bool = bool;
		System.out.println("Printing boolean "+ bool + " to Boolean - Auto boxing : " + Bool);
		//Other Ways of declaring Boolean

		Boolean Boo2 = true;
		Boolean Boo3 = new Boolean (false);
		Boolean Boo4 = Boolean.parseBoolean("True"); //parsing a String to Boolean
		System.out.println("Parsing String to Boolean : " + Boo4);
		System.out.println("UnBoxing Boolean "+ Boo3 + " to boolean : " + Boo3.booleanValue());
		System.out.println("UnBoxing Boolean "+ Boo3 + " to String : " + Boo3.toString());
		System.out.println("UnBoxing Boolean "+ Boo3 + " to Hashcode : " + Boo3.hashCode());
		System.out.println("***********************************");
		
		
		System.out.println("===========6. Float Wrapper Class ==========");

		float flt = 60.89f;
		Float FLT = flt;
		System.out.println("Printing float "+ flt + " to Float - Auto boxing : " + FLT);
		//Other Ways of declaring Float

		Float FLT2 = 34.78f;
		Float FLT3 = new Float (343.789);
		Float FLT4 = Float.parseFloat("56.784"); //parsing a String to Float
		System.out.println("Parsing String to Float : " + FLT4);
		System.out.println("UnBoxing Float "+ FLT3 + " to int : " + FLT3.intValue());
		System.out.println("UnBoxing Float "+ FLT3 + " to byte : " + FLT3.byteValue());
		System.out.println("UnBoxing Float "+ FLT3 + " to double : " + FLT3.doubleValue());
		System.out.println("UnBoxing Float "+ FLT3 + " to Long : " + FLT3.longValue());
		System.out.println("UnBoxing Float "+ FLT3 + " to Short : " + FLT3.shortValue());
		System.out.println("UnBoxing Float "+ FLT3 + " to float : " + FLT3.floatValue());
		System.out.println("UnBoxing Float "+ FLT3 + " to String : " + FLT3.toString());
		System.out.println("UnBoxing Float "+ FLT3 + " to Hashcode : " + FLT3.hashCode());
		System.out.println("***********************************");
		
		System.out.println("===========7.Long Wrapper Class ==========");

		long lng = 604534;
		Long LNG = lng;
		System.out.println("Printing long "+ lng + " to Long - Auto boxing : " + LNG);
		//Other Ways of declaring Long

		Long LNG2 = 588899L;
		Long LNG3 = new Long (343789);
		Long LNG4 = Long.parseLong("784"); //parsing a String to Long
		System.out.println("Parsing String to Long : " + LNG4);
		System.out.println("UnBoxing Long "+ LNG3 + " to int : " + LNG3.intValue());
		System.out.println("UnBoxing Long "+ LNG3 + " to byte : " + LNG3.byteValue());
		System.out.println("UnBoxing Long "+ LNG3 + " to double : " + LNG3.doubleValue());
		System.out.println("UnBoxing Long "+ LNG3 + " to Long : " + LNG3.longValue());
		System.out.println("UnBoxing Long "+ LNG3 + " to Short : " + LNG3.shortValue());
		System.out.println("UnBoxing Long "+ LNG3 + " to long : " + LNG3.floatValue());
		System.out.println("UnBoxing Long "+ LNG3 + " to String : " + LNG3.toString());
		System.out.println("UnBoxing Long "+ LNG3 + " to Hashcode : " + LNG3.hashCode());
		System.out.println("***********************************");
		
		System.out.println("=========== 8. Short Wrapper Class ==========");

		short shrt = 77;
		Short SHT = shrt;
		System.out.println("Printing short "+ shrt + " to Short - Auto boxing : " + SHT);
		//Other Ways of declaring Short

		Short SHRT2 = 348;
		Short SHRT3 = new Short((short) 67);
		
		Short SHRT4 = Short.parseShort("54"); //parsing a String to Short
		
		System.out.println("Parsing String to Short : " + SHRT4);
		System.out.println("UnBoxing Short "+ SHRT3 + " to int : " + SHRT3.intValue());
		System.out.println("UnBoxing Short "+ SHRT3 + " to byte : " + SHRT3.byteValue());
		System.out.println("UnBoxing Short "+ SHRT3 + " to double : " + SHRT3.doubleValue());
		System.out.println("UnBoxing Short "+ SHRT3 + " to Short : " + SHRT3.longValue());
		System.out.println("UnBoxing Short "+ SHRT3 + " to Short : " + SHRT3.shortValue());
		System.out.println("UnBoxing Short "+ SHRT3 + " to short : " + SHRT3.floatValue());
		System.out.println("UnBoxing Short "+ SHRT3 + " to String : " + SHRT3.toString());
		System.out.println("UnBoxing Short "+ SHRT3 + " to Hashcode : " + SHRT3.hashCode());
		System.out.println("***********************************");
	}

}
