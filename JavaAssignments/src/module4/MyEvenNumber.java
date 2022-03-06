package module4;

/**
 * @author Sudha Vijayakumar
 *
 */
public class MyEvenNumber extends Thread {
	
	@Override
	public void run() {

		MultiTable tables = new MultiTable();
		
		tables.printTable(5);
		System.out.println("Active counts : " + Thread.activeCount());
		System.out.println("--------------------");
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("CurrentThread :  " + Thread.currentThread());
		MyEvenNumber T = new MyEvenNumber();
		
		T.start();
		T.join();
		
		int number = 0;
		int i = 0;
		
		System.out.println("Printing First 20 Even numbers :");
		T.setPriority(5);
		while(i<=20)
		{
			System.out.println(number);
			sleep(300);	
			i++;
			number+=2;
			
		}
		
		System.out.println("-------------------------------------------");
	}

}
