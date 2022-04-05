package ListStack;

public class Main {
	public static void main(String[] args) {
		ListStack<String> stack = new ListStack<String>();
		
		
		stack.push("apple");
		stack.push("orange");
		stack.push("cherry");
		stack.push("banana");
		stack.print();
		
		System.out.println(stack.peek());
		stack.push("pear");
		stack.print();
		stack.pop();
		stack.print();
	}
	
}
