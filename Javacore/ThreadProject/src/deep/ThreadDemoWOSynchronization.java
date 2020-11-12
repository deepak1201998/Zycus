package deep;



public class ThreadDemoWOSynchronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank bank = new Bank();
		
		for(int i=0; i<10; i++) {
			Thread t1 = new Thread(new Transaction(bank, i));
			t1.start();
		}
		
	} 

}

