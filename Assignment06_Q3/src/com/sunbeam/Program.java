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
		bst.display();
		System.out.println("Leaf Node Count = "+ bst.countLeaf());
		System.out.println("Non Leaf Node count : "+ bst.countNonLeaf());

	}

}
