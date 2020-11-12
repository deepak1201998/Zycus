package th;

public class Reserve implements Runnable{
	
	int available = 3; //tickets
	int wanted;
	
	

	public Reserve(int wanted) {
		super();
		this.wanted = wanted;
	}



	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Available = " + available);
		if(available >= wanted) {
			String name = Thread.currentThread().getName();
			System.out.println(wanted+ " Tickets reserved for " + name);
			
			try {
				Thread.sleep(1500);
				available -= wanted;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			System.out.println("Sorry No Tickets");
			
		}
		
			
			
	}

	

}
