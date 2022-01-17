package Stack;
import java.util.Arrays;

public class StockSpanBrute {

	public static void main(String[] args) {
		int[] ht = {100, 80, 60, 70, 60, 75, 85};
		
		int[] span = new int[ht.length];
		Arrays.fill(span, 1);
		
		for(int buil = 1; buil < ht.length; buil++) {
			for(int j = buil - 1; j >= 0; j--) {
				if(ht[j] <= ht[buil]) {
					span[buil]++;
				} else {
					break;
				}
			}
		}
		
		System.out.println(Arrays.toString(span));
	}
}
