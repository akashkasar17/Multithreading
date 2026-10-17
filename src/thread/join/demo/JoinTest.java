package thread.join.demo;

public class JoinTest {

	public static void main(String[] args) throws InterruptedException {
		MyJoinDemo demo = new MyJoinDemo();
		Thread t1=new Thread(demo);
		t1.start();
		t1.join();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main ");
		}
	}

}
//hbm
//GIT
//MAVEN
//TRY
//INNER CLASS
//LAMBDA 
//STREAM API
//ST BU
//IMMUT
//OUT OF MEM
