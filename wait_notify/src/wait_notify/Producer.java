package wait_notify;

public class Producer implements Runnable {
	Queue queue;

	public Producer(Queue q) {
		queue = q;
		new Thread(this, "Insert").start();
	}

	public void run() {
		int i = 0;
		while (true) {
			queue.put(i++);
		}
	}
}
