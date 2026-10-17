package thread.synchronize.method;

public class SynchronizedDemo{

	public synchronized void test(String string) {
		for (int i = 0; i < 10; i++) {
			System.out.println("test "+string);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public synchronized void test1(String string) {
		for (int i = 0; i < 10; i++) {
			System.out.println("test1 "+string);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
