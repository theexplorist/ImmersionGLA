package BinaryTreeB4;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//10 20 -1 40 -1 -1 50 60 -1 -1 -1
		BinaryTree bt = new BinaryTree();
		bt.preOrder();
		System.out.println();
		bt.inOrder();
		System.out.println();
		bt.postOrder();
		System.out.println();
		System.out.println(bt.count());
	}

}
