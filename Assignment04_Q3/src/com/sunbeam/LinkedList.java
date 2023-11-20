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
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = nn;
		else {
			nn.next= head;
			head = nn;
		}	
	}
	
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head = nn;
		else {
			Node trav = head;
			while(trav.next!= null)
				trav=trav.next;
			trav.next = nn;
		}
	}
	
	public void display() {
		if(isEmpty())
			return;
		else {
			Node trav = head;
			System.out.print("List : ");
			while(trav!= null) {
				System.out.print(trav.data + " ");
				trav= trav.next;
			}
		}
	}
	
	public void addAfter(int value, int after ) {
		Node nn = new Node(value);
		if(isEmpty())
			head= nn;
		else {
			Node trav = head;
			while(trav.next != null && trav.data != after )
				trav = trav.next;
			nn.next= trav.next;
			trav.next= nn;
			
		}
	}
	
	public void addBefore(int value ,int before) {
		Node nn = new Node(value);
		if(isEmpty())
			head=nn;
		else if (head.data == before)
			addFirst(value);
		else {
			Node trav = head;
			while(trav.next!= null && trav.next.data!=before) {
				//System.out.println(trav.next.data + "- ");
				trav= trav.next;
			}
				nn.next = trav.next;
				trav.next= nn;
				
			
		}
	}
	
}
