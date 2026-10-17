package thread.synchronize.block;

public class TestSynch implements Runnable {
	
	private SynchronizedDemo sd;

	TestSynch(SynchronizedDemo sd) {
		this.sd = sd;
	}

	public static void main(String[] args) {
		SynchronizedDemo sd = new SynchronizedDemo();
		TestSynch ts = new TestSynch(sd);
		Thread th = new Thread(ts);
		th.start();
		sd.test(Thread.currentThread().getName());
	}

	@Override
	public void run() {
		sd.test1(Thread.currentThread().getName());
	}

}
