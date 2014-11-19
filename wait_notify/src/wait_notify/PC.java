package wait_notify;

public class PC {

	public static void main(String[] args) {
		Queue q = new Queue();
		new Producer(q);
		new Consumer(q);
	}
}
