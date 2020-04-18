
public class TestRunningThreadsInJava {

	public static void main(String[] args) {

		/* Preferred way of doing it */
		Thread t1 = new Thread(new SayHelloEvery5Secs());
		t1.start();

		Thread t2 = new Thread(new PrintLol10TimesEvery2Secs());
		t2.start();

		Thread t3 = new Thread(new SayIAMROBHeveryHalfSecond100Times());
		t3.start();

		/* Another way of doing it (NOT PREFERRED) */
		SayAnotherWay say = new SayAnotherWay();
		say.start();
	}
}

/* Preferred way */

class SayHelloEvery5Secs implements Runnable {
	@Override
	public void run() {
		while (true) {
			System.out.println("Hello");
			try {
				Thread.sleep(3000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class PrintLol10TimesEvery2Secs implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("LOL");
			try {
				Thread.sleep(2000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

class SayIAMROBHeveryHalfSecond100Times implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("IAMROBH");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/* NOT preferred way */

class SayAnotherWay extends Thread {
	public void run() {
		System.out.println("Another way");
	}
}