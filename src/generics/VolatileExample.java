package generics;

public class VolatileExample implements Runnable{

	private volatile boolean active;
	@Override
	public void run() {
		active  = true;
		int count = 1;
		while(active) {
			System.out.println(count++);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void stop() {
		active = false;
	}
	
	
	public static void main(String[] args) {
		
		
		String s[] = {"test"};
		for(String str: s) {
			System.out.println("rest");
		}
	}

}
