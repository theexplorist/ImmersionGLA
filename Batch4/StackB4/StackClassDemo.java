package StackB4;
import java.util.Stack;

public class StackClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> st = new Stack<>();
		//st.pop();
		//st.peek();.pop() //exception
		if(!st.isEmpty()) {
			System.out.println(st.peek());
		} else {
			System.out.println("Khaali hai be!");
		}
		System.out.println(st.isEmpty());
		System.out.println(st);
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		System.out.println(st);

		// pop - returns deleted value
		System.out.println(st.pop());
		System.out.println(st);
		
		//peek - returns top most value without del
		System.out.println(st.peek());
		
		//isEmpty - true(khaali), false(ni hai khaali)
		System.out.println(st.isEmpty());
		
		//size - no of elements present till now
		System.out.println(st.size());
	}

}
