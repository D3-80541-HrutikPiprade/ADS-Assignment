package com.sunbeam;

public class BSTree {
	static class Node{
		private Node left;
		private Node right;
		private int data;
		public Node(int value) {
			data = value;
			left=null;
			right = null;
		}
	}
	
	private Node root;
	private int count=0;
	public BSTree() {
		root= null;
	}
	
	public boolean isEmpty() {
		return root==null;
	}
	
	public void add(Node trav,Node nn) {
		if(root==null)
			root=nn;
		else if(nn.data<trav.data) {
			if(trav.left==null) {
				trav.left = nn;
				return;
			}
			else
				add(trav.left,nn);
		}
		else{
			if(trav.right==null) {
				trav.right = nn;
				return;
			}
			else
				add(trav.right,nn);
		}
	}
	public void add(int value) {
		Node nn = new Node(value);
		add(root,nn);
	}
	
	public void display(Node trav) {
		if(trav==null)
			return;
		display(trav.left);
		System.out.print(" "+ trav.data);
		display(trav.right);
	}
	
	public void display() {
		System.out.print("List : ");
		display(root);
		System.out.println();
	}
	
	public Node search(Node trav,int key) {
		if(trav== null)
			return null;
		if(key==trav.data)
			return trav;
		else if(key<trav.data)
			return  search(trav.left,key);
		else
			return search(trav.right,key);
	}
	
	public void search(int key) {
		Node r = search(root,key);
		if(r==null)
			System.out.println("key not found!!!");
		else
			System.out.println("key found : "+ r.data);
		
	}
	public void countLeaf(Node trav ) {
		if(trav.left==null &&  trav.right==null) {
			count++;
			//System.out.println(trav.data);
			return;
		}
		if(trav.left!=null)
			countLeaf(trav.left);
		if(trav.right!= null)
			countLeaf(trav.right);
			
	}
	public int countLeaf() {
		if(root == null)
			return 0;
		countLeaf(root);
		return count;
	}
	
}
