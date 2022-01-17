package Stack;
import java.util.Stack;

public class NumberOfValidSubarrays {

	public int validSubarrays(int[] ht) {

		Stack<Integer> vis = new Stack<>();
		vis.push(0);
		int[] nge = new int[ht.length];
		for(int curr = 1; curr < ht.length; curr++) {
			
			while(!vis.isEmpty() && ht[vis.peek()] > ht[curr]) {
				//System.out.println("nge of " + vis.pop() + " is " + ht[curr]);
				nge[vis.pop()] = curr;
			}
			
			vis.push(curr);
		}
		
		while(!vis.isEmpty()) {
			//System.out.println("nge of " + vis.pop() + " is " + -1);
			nge[vis.pop()] = ht.length;
		}
		
		int count = 0;
		for(int i = 0; i < nge.length; i++) {
			count += (nge[i] - i);
		}
		
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
