package SList;

public class Main {
	public static void main(String[] args) {
		SList<String> s = new SList<String>();
		s.insertFront("cherry");
		s.insertAfter("pear", s.head);
		s.insertAfter("banana", s.head.getNext());
		s.insertFront("apple");
		s.print();
	
		System.out.println(": s의 길이 ="+ s.size());
		System.out.println("체리가 "+ s.search("cherry")+"번째에 있다.");
		System.out.println("키위가 "+ s.search("kiwi")+"번째에 있다.");
		
		
		s.DeleteAfter(s.search2("apple")); //특정 문자열이 든 노드 직접 접근하기
		s.print();
		System.out.println(": s의 길이 ="+ s.size());
		s.DeleteFront();
		s.print();
	}

}
