package wait_notify;

public class Queue {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		if (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("перехвачено");
			}

		System.out.println("Получено" + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized int put(int n) {
		if (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("перехвачено");
			}

		this.n = n;
		valueSet = true;
		System.out.println("Отправлено" + n);
		notify();
		return n;
	}
}