package wait_notify;

public class Queue {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		if (!valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("�����������");
			}

		System.out.println("��������" + n);
		valueSet = false;
		notify();
		return n;
	}

	synchronized int put(int n) {
		if (valueSet)
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println("�����������");
			}

		this.n = n;
		valueSet = true;
		System.out.println("����������" + n);
		notify();
		return n;
	}
}