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
		bst.add(12);
		bst.display();
		System.out.println("Level :"+ bst.level(8));
		System.out.println("Level :"+ bst.level(3));
		System.out.println("Level :"+ bst.level(6));
		System.out.println("Level :"+ bst.level(4));
		
		

	}

}
