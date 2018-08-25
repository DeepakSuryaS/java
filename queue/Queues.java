package queue;

import java.util.LinkedList;

public class Queues {

	LinkedList<Integer> queue;

	//constructor
	public Queues () {
		queue = new LinkedList<Integer>();
	}
	
	//methods
	public boolean isEmpty () {
		return queue.isEmpty();
	}

	public int size () {
		return queue.size();
	}

	public void enqueue (int n) {
		queue.addLast(n);
	}

	public int dequeue () {
		return (int) queue.remove(0); //returns an object so we have to cast it to an int
	}

	public int peek () {
		return (int) queue.get(0);
	}

	
	public static void main (String[] args) {
		Queues aQueue = new Queues();
		aQueue.enqueue(1);
		aQueue.enqueue(2);
		aQueue.enqueue(3);
		System.out.println("First out : " + aQueue.dequeue());
		System.out.println("Second out : " + aQueue.dequeue());
		System.out.println("Peek : " + aQueue.peek());
		System.out.println("Is the queue empty ? : " + aQueue.isEmpty());
		System.out.println("How long is it ? : " + aQueue.size());

	}
}
