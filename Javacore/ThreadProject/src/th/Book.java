package th;

public class Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Reserve ob  = new  Reserve(3);
		Thread t1 = new Thread(ob, "Ravi");
		Thread t2 = new Thread(ob, "deepak");
		
		t2.start();
		t1.start();
		

	}

}
