package linkedlist;

import java.util.Scanner;

public class LinkedList {
    //Properties
    Node head = new Node();
    int count;

    //Constructors
    public LinkedList() {  
		count = 0;
    }

    public LinkedList(Node newHead) {
		head = newHead;
		count = 1;
    }

    //Methods
    public void add(int newData) {
		if(head != null) {
			Node temp = new Node(newData);
			Node current = head;
			while(current.getNext() != null) {  //if current is null, it wouldn't know what getNext() is, so we'll get an err
			    current = current.getNext();  
			}
			current.setNext(temp);
			count++;	
		} else {
			head.setData(newData);
			count = 1;
		}
    }

    //get
    public int get(int index) {
	if(index < 0) { return -1; }
	Node current = head;
	for(int i = 0; i < index; i++) {
	    current = current.getNext();
	}
		return current.getData();
    }

    //size
    public int size() {
		return count;
    }

    //isEmpty
    public boolean isEmpty() {
		return head == null;
    }    

    //remove
    public void remove() {
	Node current = head;
	while(current.getNext().getNext() != null) {
	    current = current.getNext();
	}
        current.setNext(null);
		count--;
    }

    public static void main(String[] args) {
		LinkedList newList = new LinkedList();
		newList.add(5);
		newList.add(10);
		newList.add(15);
		newList.add(1);
		System.out.println(newList.isEmpty());
		System.out.println(newList.size());
		for(int i = 1; i <= newList.size(); i++){
			System.out.println("newList Index " + i + " : " + newList.get(i));
		}
		System.out.println();
		LinkedList babyList = new LinkedList();
		babyList.add(101);
		babyList.add(102);
		babyList.add(103);
		System.out.println(babyList.isEmpty());
		System.out.println(babyList.size());
		for(int i = 1; i <= babyList.size(); i++){
			System.out.println("babyList Index " + i + " : " + babyList.get(i));
		}
    }
}


//feature to remove just any item in the list has to be implemented
