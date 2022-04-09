
//자료구조 과제 #4 60191645 김민서
package ListStackASM;

import java.util.Arrays;

public class Main {
	public static void change(String s) {
		ListStack<Character> stack = new ListStack<Character>();
		int button = 0;

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == '(') {
				button = button + 1;
				stack.push(s.charAt(i));

			} else if (button != 0
					&& (s.charAt(i) == '-' || s.charAt(i) == '+' || s.charAt(i) == '/' || s.charAt(i) == '*')) {
				stack.push(s.charAt(i));

			}

			else if (button != 0 && s.charAt(i) == ')') {
				while (stack.peek() != '(') {
					System.out.print(stack.pop());
				}
				stack.pop();
				button = button - 1;
			}

			else if (button != 0)
				System.out.print(s.charAt(i));

			else if (stack.isEmpty() && s.charAt(i) == '+') {
				stack.push(s.charAt(i));

			} else if (stack.isEmpty() && s.charAt(i) == '-') {
				stack.push(s.charAt(i));

			} else if (s.charAt(i) == '+') {
				for (int j = stack.size(); j > 0; j--) {
					System.out.print(stack.peek());
					stack.pop();
				}

				stack.push(s.charAt(i));
			} else if (s.charAt(i) == '-') {
				for (int j = stack.size(); j > 0; j--) {
					System.out.print(stack.peek());
					stack.pop();
				}
				stack.push(s.charAt(i));

			} else if (stack.isEmpty() == true && s.charAt(i) == '*') {
				stack.push(s.charAt(i));

			}

			else if (s.charAt(i) == '*' && (stack.peek() == '-' || stack.peek() == '+')) {
				stack.push(s.charAt(i));

			} else if (s.charAt(i) == '*' && (stack.peek() == '*' || stack.peek() == '/')) {
				for (int j = stack.size(); j > 0; j--) {
					System.out.print(stack.peek());
					stack.pop();
				}
				stack.push(s.charAt(i));

			}

			else if (stack.isEmpty() == true && s.charAt(i) == '/') {
				stack.push(s.charAt(i));

			} else if (s.charAt(i) == '/' && (stack.peek() == '-' || stack.peek() == '+')) {
				stack.push(s.charAt(i));
			}

			else if (s.charAt(i) == '/' && (stack.peek() == '*' || stack.peek() == '/')) {
				for (int j = stack.size(); j > 0; j--) {
					System.out.print(stack.peek());
					stack.pop();
				}
				stack.push(s.charAt(i));

			}

			else {
				System.out.print(s.charAt(i));
			}
		}
		for (int j = stack.size(); j > 0; j--) {
			System.out.print(stack.pop());

		}
		System.out.println();
	}

	public static void main(String[] args) {

		change("A-B+C/D");
		change("A/B-C*D");
		change("A-B*C+D/E-F");
		change("(A-B)*C-(D/(E+F))");
	}

}
