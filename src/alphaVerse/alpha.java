package alphaVerse;

public class alpha {
	
	public static void main(String[] args) {
		Thread  thread = new Thread( new Runnable() {
			
			@Override
			public void run() {
				System.out.println("The Thread you created has started running. Its name is: "+ Thread.currentThread().getName());
				
			}
		});
		System.out.println("Before running the thread i have just created, the main thread is what is running. Its name is: "+ Thread.currentThread().getName());
		System.out.println("Now I have started the thread I created");
		
		thread.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
