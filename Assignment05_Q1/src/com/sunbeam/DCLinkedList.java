package com.sunbeam;
public class DCLinkedList {
	static class Node{
		private int data;
		private Node prev;
		private Node next;
		public Node(int value) {
			data= value;
			prev=null;
			next=null;
		}
	}
	private Node head;
	
	public DCLinkedList() {
		head=null;
	}
	public boolean isEmpty()
	{
		return head ==null;
	}
	public void addPosition(int value,int pos) {
		Node nn = new Node(value);
		if(isEmpty()) {
			nn.next=nn;
			nn.prev=nn;
			head= nn;
		}
		else if(pos<=1) {
			nn.next=head.next;
			nn.prev=head.prev;
			head.next=nn;
			nn.next.prev=nn;
			head=nn;
		}
		else {
			Node trav = head;
			for(int i =1; i<pos-1 && trav.next!=head;i++,trav= trav.next);
			nn.next=trav.next;
			nn.prev=trav;
			trav.next=nn;
			nn.next.prev=nn;
		}
			
	}
	
	public void display() {
		if(isEmpty())
			return;
		else {
			System.out.print("List : ");
			Node trav = head;
			do {
				System.out.print(" "+ trav.data);
				trav= trav.next;
			}while(trav!=head);
		}
	}
	
	public void deletePosition(int pos) {
		if(isEmpty())
			return;
		else if(head.next==head)
			head=null;
		else if(pos<=1) {
			head.prev.next=head.next;
			head.next.prev=head.prev;
			head = head.next;
		}
		else {
			Node trav = head;
			for(int i=1; i<pos&& trav.next!=head;i++,trav=trav.next);
			trav.prev.next=trav.next;
			trav.next.prev=trav.prev;
		}
	}
}
