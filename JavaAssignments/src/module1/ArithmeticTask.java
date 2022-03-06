package module1;

public class ArithmeticTask {

	public static void main(String[] args) {
		typesData();
		arithOper();
		
	}
		public static void typesData()
		{
			byte age = 78;
			short Studentcount = 6500;
			int regcode = 34567;
			long population = 9876543;
			float ht = 43.5f;
			double salary = 56783.983;
			boolean log = true;
			char init= 'G';
			String name = "Music";
			System.out.println("Age = " + age);
			System.out.println("Studentcount = " + Studentcount);
			System.out.println("Registration Code = " + regcode);
			System.out.println("Height in meter = " + ht*100);
			System.out.println("Salary /annum= " + salary*12);
			System.out.println("Name = " + init + "." + name);
			System.out.println("10 times of Total Population = " + population*(10));
		}
	
		public static void arithOper()
		{
			byte age = 78;
			short Studentcount = 6500;
			int regcode = 34567;
			long population = 9876543;
			float increment = 43.5f;
			double salary = 56783.983;
			boolean log = true;
			char init= 'G';
			String name = "Music";
			
			if (log=true)
			{
				salary = salary * increment;
				System.out.println("Multiplication = " + salary);
				regcode = regcode/age;
				System.out.println("Division = "+ regcode);
			}
			do
			{
				population = population - Studentcount ;
				salary = salary + increment;
				System.out.println("Subtraction = "+ population);
				System.out.println("Addition = "+ salary);
				
			}while(log=false);
			
			for (int i=0; i<=50;i++)
			{
				regcode = Studentcount + 1;
			}
			System.out.println("End of year registration code = "+regcode);
			log = false;
			while(Studentcount>=6495)
			{
				System.out.println(name +"."+ init +" - "+ Studentcount);
				Studentcount--;
			}
		}
		

}
