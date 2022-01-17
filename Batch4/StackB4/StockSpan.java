package StackB4;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {100, 80, 60, 70, 60, 75, 85};
		int[] span = new int[ht.length];
		span[0] = 1;
		Stack<Integer> vis = new Stack<>();
		vis.push(0);
		
		for(int curr = 1; curr < ht.length; curr++) {
			while(!vis.isEmpty() && ht[vis.peek()] <= ht[curr]) {
				vis.pop();
			}
			
			span[curr] = vis.isEmpty() ? curr + 1 : curr - vis.peek();
			vis.push(curr);
		}
		
		System.out.println(Arrays.toString(span));
	}

}
