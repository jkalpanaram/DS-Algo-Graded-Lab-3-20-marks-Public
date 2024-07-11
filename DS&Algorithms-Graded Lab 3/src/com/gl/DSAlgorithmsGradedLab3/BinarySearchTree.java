package com.gl.DSAlgorithmsGradedLab3;

import java.util.ArrayList;
import java.util.Scanner;

public class BinarySearchTree {
	ArrayList<Integer> list = new ArrayList<>();
	public static void main(String[] args) {
		
		BinarySearchTree bst = new BinarySearchTree();
		MyNode root = null;
		MyNode nn = null;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Please enter number of nodes");
			int size = sc.nextInt();
			int i;
			for (i = 1; i <= size; i++) {
				System.out.println("Please enter data for the node : ");
				int data = sc.nextInt();
				
				nn = new MyNode(data);
				if(root == null)
					root = nn;
				else
					bst.insert(root,nn);
					
			}
			
				bst.inOrder(root);
				System.out.println(bst.list);
				
				System.out.println("Please enter the SUM ");
				int sum = sc.nextInt();
				int flag = 0;
				for(i = 0; i<bst.list.size(); i++) {
					int n1 = bst.list.get(i);
					
					int n2 = sum - n1;
					
					if(bst.list.contains(n2) && n1 != n2 && n1<n2) {
						System.out.println("FOUND");
						flag = 1;
						System.out.println("["+n1+","+n2+"]");
										}
					}
				if(flag == 0)
					System.out.println("NO elements found");
				sc.close();
		}

	}
	private void inOrder(MyNode root) {
		if(root != null) {
			inOrder(root.left);
			list.add(root.data);
			inOrder(root.right);
		}
		
	}
	private void insert(MyNode root, MyNode nn) {
		if(nn.data > root.data) {
		if(root.right == null) {
			root.right = nn;
		}
		
		else {
			insert(root.right,nn);
		}
	}
		else {
			if(root.left == null) {
				root.left = nn;
			}
			else {
				insert(root.left,nn);
			}
		}
	}
}

