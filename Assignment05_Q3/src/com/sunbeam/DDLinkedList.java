package com.sunbeam;
public class DDLinkedList {
	static class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	private Node head;
	private Node tail;
	public DDLinkedList() {
		head =null;
		tail = null;
	}
	
	public boolean isEmpty() {
		return head ==null && tail == null;
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head=tail=nn;
		else {
			nn.next=head;
			head.prev =nn;
			head = nn;
		}		
	}
	
	public void display() {
		if(isEmpty())
			return ;
		else {
			Node trav = head;
			System.out.print("List : ");
			while(trav!=null) {
				System.out.print(" "+ trav.data);
				trav= trav.next;
			}
		}
	}
	
	public void deleteFirst() {
		if(isEmpty())
			return;
		else if(head == tail)
			head = tail = null;
		else {
			head = head.next;
			head.prev= null;
			
		}
	}
	
	public void addLast(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			head= tail = nn;
		else {
			nn.prev= tail;
			tail.next=nn;
			tail=nn;
		}
	}
	
	public void deleteLast() {
		if(isEmpty())
			return;
		else if(head == tail)
			head =tail=null;
		else {
			tail = tail.prev;
			tail.next=null;
			
		}
	}
	
	public void addPostion(int value,int pos) {
		Node nn = new Node(value);
		if(isEmpty()) 
			head=tail=nn;
		else if(pos<=1)
			addFirst(value);
		else {
			Node trav= head;
			for(int i=1; i<pos-1 && trav.next!= null ; i++,trav=trav.next);
			nn.prev= trav;
			nn.next=trav.next;
			if(trav.next!= null)
				trav.next.prev= nn;
			trav.next=nn;
		}		
	}
	
	public void deletePostion(int pos) {
		if(isEmpty())
			return;
		else if(pos<=1)
			deleteFirst();
		else {
			Node trav = head;
			for(int i=1; i<pos && trav.next!= null ; i++,trav=trav.next);
			if(trav.next== null)
				deleteLast();
			else {
				trav.prev.next= trav.next;
				trav.next.prev= trav;
			}
			
		}
	}
}
