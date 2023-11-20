package com.sunbeam;
public class SCLinkedList {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}	
	}
	
	private Node tail;
	public SCLinkedList() {
		tail= null;
	}
	
	public boolean isEmpty() {
		return tail==null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			tail = nn;
			tail.next= nn;
		}
		else
		{
			nn.next = tail.next;
			tail.next= nn;
		}
	}
	
	public void display() {
		if(isEmpty())
			return;
		else if(tail.next== tail)
			System.out.println("List : "+ tail.data);
		else {
			Node trav = tail;
			System.out.print("List : ");
			do{
				trav=trav.next;
				System.out.print(trav.data + " ");
				
			}while(trav != tail);
		}
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty()) {
			tail = nn;
			nn.next = tail;
		}
		else {
			Node trav = tail.next;
			while(trav!= tail) {
				trav= trav.next;
			}
			nn.next=trav.next;
			trav.next= nn;
			tail = nn;		
		}
	}
	
	public void deleteFirst() {
		if(tail ==null)
			return;
		else if(tail.next == tail)
			tail= null;
		else {
			tail.next = tail.next.next;
		}
	}
	
	public void deleteLast() {
		if(tail==null)
			return;
		else if(tail.next==tail)
			tail= null;
		else {
			Node trav = tail.next;
			while(trav.next!=tail)
				trav= trav.next;
			trav.next= tail.next;
			tail = trav;
		}
	}
	
	public void addPosition(int value,int pos ) {
		Node nn = new Node(value);
		if(isEmpty()) {
			tail = nn;
			nn.next= tail;
		}
		else if(pos<1)
			deleteFirst();
		else {
			Node trav = tail.next;
			for(int i =1; i<pos-1 && trav.next!=null; trav= trav.next,i++ );
			nn.next =trav.next;
			trav.next= nn;
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(pos<=1)
			deleteFirst();
		else {
			Node trav = tail.next;
			for(int i=1; trav.next.next != tail.next && i<pos-1;i++, trav = trav.next);
			if(trav.next== tail)
				deleteLast();
			else
			trav.next = trav.next.next;
		}
	}
}
