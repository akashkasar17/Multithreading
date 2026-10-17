package thread.yield.demo;

public class Test {

	public static void main(String[] args) {
		YieldDemo demo=new YieldDemo();
		Thread t1=new Thread(demo);
//		t1.setPriority(10);
		t1.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main");
			Thread.yield();
		}
	}

}
