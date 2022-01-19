package StackB4;

import java.util.Stack;

public class ValidParenthesis {

	public boolean isValid(String s) {

		Stack<Character> vis = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			char currC = s.charAt(i);

			if (currC == '[' || currC == '{' || currC == '(') {
				vis.push(currC);
			} else if (currC == ']' || currC == '}' || currC == ')') {

				if (vis.isEmpty()) {
					return false;
				}
				char topCh = vis.pop();
				if (currC == ')' && topCh == '(') {
					continue;
				}

				if (currC == '}' && topCh == '{') {
					continue;
				}

				if (currC == ']' && topCh == '[') {
					continue;
				}

				return false;
			}
		}

		if (!vis.isEmpty()) {
			return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
