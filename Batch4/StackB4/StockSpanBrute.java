package StackB4;

import java.util.Arrays;

public class StockSpanBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ht = {100, 80, 60, 70, 60, 75, 85};
		int[] span = new int[ht.length];
		Arrays.fill(span, 1);
		
		for(int curr = 1; curr < ht.length; curr++) {
			for(int j = curr - 1; j >= 0; j--) {
				if(ht[j] <= ht[curr]) {
					span[curr]++;
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(span));
	}

}
