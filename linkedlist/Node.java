package linkedlist;

public class Node {
    //properties
    Node next;
    int data;
    
    //Constructors
    public Node() {
    	this.data = data;
    	this.next = next;
    }
    public Node(int newData) {
        this.data = newData;
		this.next = null; 
    }
    public Node(int newData, Node newNext) {
        this.data = newData;
		this.next = newNext;
    }

    //Methods

    //Getters and setters
    public int getData() {
		return this.data;
    }

    public Node getNext() {
		return this.next;
    }

    public void setData(int newData) {
		this.data = newData;
    }

    public void setNext(Node newNode) {
		this.next = newNode;
    }
}
