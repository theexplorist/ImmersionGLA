package StackB4;

import java.util.Stack;

public class Validsubarrays {

	public int validSubarrays(int[] ht) {

		int[] nge = new int[ht.length];
		Stack<Integer> vis = new Stack<>();
		vis.push(0);
		
		for(int curr = 1; curr < ht.length; curr++) {
			while(!vis.isEmpty() && ht[vis.peek()] > ht[curr]) {
				nge[vis.pop()] = curr;
			}
			
			vis.push(curr);
		}
		
		while(!vis.isEmpty()) {
			nge[vis.pop()] = ht.length;
		}
		
		int count = 0;
		for(int i = 0; i < nge.length; i++) {
			int s = i;
			int e = nge[i];
			count += (s - e);
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
