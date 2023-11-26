package com.sunbeam;

public class Program {

	public static void main(String[] args) {
		BSTree bst = new BSTree();
		bst.add(8);
		bst.add(10);
		bst.add(3);
		bst.add(1);
		bst.add(14);
		bst.add(6);
		bst.add(7);
		bst.add(13);
		bst.add(4);
		//bst.add(12);
		bst.display();
		
		bst.parent(8);
		bst.parent(15);
		bst.parent(10);
		bst.parent(6);
		bst.parent(13);

	}

}
