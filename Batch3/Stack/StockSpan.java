package Stack;
import java.util.Arrays;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = { 100, 80, 60, 70, 60, 75, 85 };

		int[] span = new int[ht.length];
		span[0] = 1;
		Stack<Integer> vis = new Stack<>();
		vis.push(0);
		
		for(int buil = 1; buil < ht.length; buil++) {
			while(!vis.isEmpty() && ht[vis.peek()] <= ht[buil]) {
				vis.pop();
			}
			
			span[buil] = vis.isEmpty() ? buil + 1 : buil - vis.peek();
			vis.push(buil);
		}
		
		System.out.println(Arrays.toString(span));
	}

}
