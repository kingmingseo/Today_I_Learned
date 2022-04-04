package ArrayStack;

public class Main {
	public static void main(String[] args) {
		ArrayStack<String> stack =new ArrayStack<String>();
		

		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		stack.print();
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		stack.print();
	}
}

