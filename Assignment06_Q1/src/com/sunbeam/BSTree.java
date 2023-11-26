package com.sunbeam;

public class BSTree {
	static class Node {
		private int data;
		private Node right;
		private Node left;
		
		public Node(int value ) {
			data = value;
			right =null;
			left=null;
		}
		
		
		
	}
	public Node root;
	public BSTree() {
		root=null;
	}
	
	public void add(Node trav,Node nn) {
		
		if(root ==null)
			root=nn;
		else if(trav.data>nn.data)
			if(trav.left==null)
				trav.left=nn;
			else
				add(trav.left,nn);
		else
			if(trav.right==null)
				trav.right=nn;
			else
			add(trav.right,nn);
	}
	
	public void add(int value) {
		Node nn = new Node(value);
		add(root,nn);
	}
	
	public void inorder(Node trav) {
		if(trav==null)
			return;
		inorder(trav.left);
		System.out.print(" "+ trav.data);
		inorder(trav.right);
	}
	
	public void inorder() {
		System.out.print("Inorder : ");
		inorder(root);
		System.out.println();
	}
	public Node[] searchWithParent(int key) {
		Node parent=null;
		Node trav=root;
		while(true) {
			if(trav==null)
				break;
			if(trav.data==key)
				break;
			if(key<trav.data) {
				parent = trav;
				trav=trav.left;
			}
			else {
				parent=trav;
				trav=trav.right;
			}
		}
		if(trav==null)
			parent =null;
		
		return new Node[] {trav,parent};
		
		
	}
	
	
	public void delete(int key) {
		Node arr[] = searchWithParent(key);
		Node temp = arr[0];
		Node parent = arr[1];
		if(temp==null) {
			System.out.println("key not found !!");
			return ;
		}
		if(temp.right!=null && temp.left!=null) {
			Node succ =temp.right;
			parent = temp;
			while(succ.left!=null) {
				parent =succ;
				succ=succ.left;
			}
			temp.data=succ.data;
			temp=succ;
		}

		if(temp.right!= null) {
			if(temp==root)
				root=temp.right;
			else if(temp==parent.left)
				parent.left=temp.right;
			else if(temp== parent.right)
				parent.right=temp.right;
		}
		else {
			if(temp==root)
				root= temp.left;
			else if(temp==parent.left)
				parent.left = temp.left;
			else if(temp==parent.right)
				parent.right = temp.left;
		}

	}
	
	
	
}
