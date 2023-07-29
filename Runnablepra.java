package in.surya;
public class Runnablepra implements Runnable {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Runnablepra r = new Runnablepra();
		Thread thread = new Thread(r);
		thread.start();
	}

}
