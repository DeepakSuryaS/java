package moreLinkedList;

import java.util.Scanner;

class Node {
	int data;
	Node next;

	//constructor
	Node(int d) {
		data = d;
		next = null;
	}
}

public class RemoveDuplicates {

	public static Node insert(Node head, int data) {
		Node p = new Node(data);
		
		if (head == null) {
			head = p;
		} else if (head.next == null) {
			head.next = p;
		} else {
			Node start = head;
			while(start.next != null) {
				start = start.next;
			}
			start.next = p;
		}
		return head;
	}

	public static void display(Node head) {
		Node start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static Node removeDuplicates(Node head) {
		Node temp = head;
		while (temp != null && temp.next != null) {
			while (temp.next != null &&temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}
			temp = temp.next;
		}
		return head;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		Node head = null;

		while (n-- > 0) {
			int ele = scan.nextInt();
			head = insert(head, ele);
		}

		removeDuplicates(head);
		display(head);
	}

}
