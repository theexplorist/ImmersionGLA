package Stack;
import java.util.Stack;

public class FormMinNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "IDIIIIDD";
		Stack<Integer> st = new Stack<>();
		
		for(int i = 0; i <= str.length(); i++) {
			
			st.push(i + 1);
			
			if(i == str.length() || str.charAt(i) == 'I') {
				while(!st.isEmpty()) {
					System.out.print(st.pop());
				}
			}
		}
	}

}
