package SList;

public class Main {
	public static void main(String[] args) {
		SList<String> s = new SList<String>();
		s.insertFront("kim");
		s.insertAfter("min", s.head);
		s.insertAfter("seo", SNode("min",));
		s.print();
	}

}
