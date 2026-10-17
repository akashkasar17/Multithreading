package thread.daemon;

public class TestDaemon {

	public static void main(String[] args) {
		DaemonThreadExample demon = new DaemonThreadExample();
		Thread th1 = new Thread(demon);
		th1.setDaemon(true);
		th1.start();
		// th1.setDaemon(true);//IllegalThreadStateException bcz we are setting up the
		// thread as daemon after it is started
		System.out.println("End of Main");
	}

}
