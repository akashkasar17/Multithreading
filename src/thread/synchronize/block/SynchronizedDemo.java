package thread.synchronize.block;

public class SynchronizedDemo {

	public void test(String string) {
		// 5000 lines of code
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("test " + string);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		// 5000 lines of code
	}

	public void test1(String string) {

		// 5000 lines of code
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println("test1 " + string);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		// 5000 lines of code
	}

}
