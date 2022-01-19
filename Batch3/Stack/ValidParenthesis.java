package Stack;

import java.util.Stack;

public class ValidParenthesis {

	public boolean isValid(String s) {

		Stack<Character> vis = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char cc = s.charAt(i);

			if (cc == '[' || cc == '{' || cc == '(') {
				vis.push(cc);
			} else if (cc == ']' || cc == '}' || cc == ')') {
				// left mein open similar hai?
				if(vis.isEmpty()) {//open khatam
					return false;
				}
				char topCh = vis.pop();

				if (topCh == '[' && cc == ']') {
					continue;
				}

				if (topCh == '{' && cc == '}') {
					continue;
				}

				if (topCh == '(' && cc == ')') {
					continue;
				}

				return false;
			}
		}
		
		if(!vis.isEmpty()) {//closed khatam
			return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
