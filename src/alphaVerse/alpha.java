package alphaVerse;

public class alpha {
	
	public static void main(String[] args) {
		Thread  thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("The current Thread name is: "+ Thread.currentThread().getName());
				
			}
		});
		System.out.println("Before running the thread i have just created");
		System.out.println("The current Thread name is: "+ Thread.currentThread().getName());
		
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
