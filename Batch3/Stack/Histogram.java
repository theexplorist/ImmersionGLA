package Stack;

import java.util.Arrays;
import java.util.Stack;

public class Histogram {

	public static int largestRectangleArea(int[] ht) {

		int[] pse = new int[ht.length];
		pse[0] = -1;

		Stack<Integer> vis = new Stack<>();
		vis.push(0);

		for (int curr = 1; curr < ht.length; curr++) {
			while (!vis.isEmpty() && ht[vis.peek()] >= ht[curr]) {
				vis.pop();
			}

			if (!vis.isEmpty()) {
				pse[curr] = vis.peek();
			} else {
				pse[curr] = -1;
			}

			vis.push(curr);
		}

		System.out.println(Arrays.toString(pse));

		vis = new Stack<>();
		vis.push(0);
		int[] nse = new int[ht.length];
		for (int curr = 1; curr < ht.length; curr++) {

			while (!vis.isEmpty() && ht[vis.peek()] > ht[curr]) {
				// System.out.println("nge of " + vis.pop() + " is " + ht[curr]);
				nse[vis.pop()] = curr;
			}

			vis.push(curr);
		}

		while (!vis.isEmpty()) {
			// System.out.println("nge of " + vis.pop() + " is " + -1);
			nse[vis.pop()] = ht.length;
		}

		System.out.println(Arrays.toString(nse));


		int maxArea = Integer.MIN_VALUE;
		for (int curr = 0; curr < ht.length; curr++) {
			int width = nse[curr] - pse[curr] - 1;
			int area = width * ht[curr];
			maxArea = Math.max(maxArea, area);
		}
		return maxArea;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = { 2, 1, 5, 6, 2, 3 };
		System.out.println(largestRectangleArea(ht));
	}

}
