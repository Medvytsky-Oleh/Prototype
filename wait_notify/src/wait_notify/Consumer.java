package wait_notify;

public class Consumer implements Runnable {
	Queue queue;

	public Consumer(Queue q) {
		queue = q;
		new Thread(this, "Getter").start();
	}

	public void run() {
		while (true) {
			queue.get();
		}
	}
}
