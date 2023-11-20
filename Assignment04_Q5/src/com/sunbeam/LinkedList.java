package com.sunbeam;

public class LinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
	
	
	public LinkedList() {
		head=null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	

	
	public void display() {
		if(isEmpty())
			return;
		else {
			System.out.print("List : ");
			Node trav = head;
			while(trav!= null) {
				System.out.print(trav.data+ " ");
				trav = trav.next;
			}
		}
	}
	
	
	
	public void addSorted(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head =nn;
		else if(head.data>=value) {
			nn.next=head;
			head = nn;
		}
		else {
			Node trav = head;
			while(trav.next!= null &&  trav.next.data <=value)
				trav=trav.next;
			nn.next = trav.next;
			trav.next=nn;
		}
	}
	
}
