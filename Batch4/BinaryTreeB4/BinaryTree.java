package BinaryTreeB4;

import java.util.Scanner;

public class BinaryTree {

	private class TreeNode {

		int data;
		TreeNode left;
		TreeNode right;

		public TreeNode(int data) {
			// TODO Auto-generated constructor stub
			this.data = data;
		}
	}

	private TreeNode root; // null
	private Scanner s = new Scanner(System.in);

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = constructTree(); //2k
	}

	private TreeNode constructTree() {
		// TODO Auto-generated method stub

		int val = s.nextInt();
		if(val == -1) {
			return null;
		}
		TreeNode curr = new TreeNode(val);
		
		curr.left = constructTree();//left
		curr.right = constructTree();//right
		return curr;
	}
	
	public void preOrder() {
		// TODO Auto-generated method stub

		preOrder(root);
	}
	private void preOrder(TreeNode root) {
		// TODO Auto-generated method stub

		if(root == null) {
			//System.out.print(-1 + " ");
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
		preOrder(root.right);
	}
	
	public void inOrder() {
		// TODO Auto-generated method stub

		inOrder(root);
	}
	private void inOrder(TreeNode root) {
		// TODO Auto-generated method stub

		if(root == null) {
			//System.out.print(-1 + " ");
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " ");
		inOrder(root.right);
	}
	
	public void postOrder() {
		// TODO Auto-generated method stub

		postOrder(root);
	}
	private void postOrder(TreeNode root) {
		// TODO Auto-generated method stub

		if(root == null) {
			//System.out.print(-1 + " ");
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}
	
	public int count() {
		return countNodes(root);
	}
	private int countNodes(TreeNode root) {
		// TODO Auto-generated method stub

		if(root == null) {
			return 0;
		}
		int leftCount = countNodes(root.left);
		int rightCount = countNodes(root.right);
		
		int total = leftCount + rightCount + 1;
		
		return total;
	}
}
