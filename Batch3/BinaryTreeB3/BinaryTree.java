package BinaryTreeB3;

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
	
	private Scanner sc = new Scanner(System.in);
	private TreeNode root;
	
	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = constructTree();//2k
	}
	
	private TreeNode constructTree() {
		// TODO Auto-generated method stub

		int val = sc.nextInt();
		if(val == -1) {
			return null;
		}
		TreeNode nn = new TreeNode(val);//apna
		
		nn.left = constructTree();//left
		nn.right = constructTree();//6k //right
		return nn;
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
		System.out.print(root.data + " ");//apna
		preOrder(root.left);//left
		preOrder(root.right);//right
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
		inOrder(root.left);//left
		System.out.print(root.data + " ");//apna
		inOrder(root.right);//right
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
		postOrder(root.left);//left
		postOrder(root.right);//right
		System.out.print(root.data + " ");//apna
	}
}
