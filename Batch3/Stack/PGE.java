package Stack;
import java.util.Stack;

public class PGE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {50, 30, 20, 40};
		
		int[] pge = new int[ht.length];
		pge[0] = -1;
		
		Stack<Integer> vis = new Stack<>();
		vis.push(0);
		
		for(int curr = 1; curr < ht.length; curr++) {
			while(!vis.isEmpty() && ht[vis.peek()] <= ht[curr]) {
				vis.pop();
			}
			
			if(!vis.isEmpty()) {
				pge[curr] = ht[vis.peek()];
			} else {
				pge[curr] = -1;
			}
			
			vis.push(curr);
		}
	}

}
