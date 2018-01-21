package chapter9;

public class FunctionalInterface {

	public static void main (String[] args) {
		
		//createThreadUsingAnonClass();
		createThreadUsingLambda();
	}
	/**
	 * 
	 */
	private static void createThreadUsingLambda() {
		
		Runnable r = () ->{System.out.println("Thread using Lamba");};
		Thread thread = new Thread(r);
		 	   thread.start();
	}
	
	
	@SuppressWarnings("unused")
	private static void createThreadUsingAnonClass() {
		
		Runnable runnableOb = new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread using Anonymoon");
				
			}
		};
		
		Thread thread = new Thread(runnableOb);
		 	   thread.start();
	}
}

 