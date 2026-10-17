package thread.sleep.demo;

public class SleepDemo {

	public static void main(String[] args) throws InterruptedException {
		TestThread tt = new TestThread();
		Thread t1=new Thread(tt);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Hello main");
			Thread.sleep(1000);
		}
	}

}
