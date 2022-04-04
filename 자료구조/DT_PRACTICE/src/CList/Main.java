package CList;

public class Main {
	public static void main(String[] args) {
		CList<String> s = new CList<String>();
		
		s.insert("pear"); s.print();
		s.insert("cherry"); s.print();
		s.insert("orange"); s.print();
		s.insert("apple"); s.print();
		s.insert("banana"); s.print();	
		System.out.println(":s의 길이 = "+s.size()+"\n");
		s.delete(); s.print();
		System.out.println(":s의 길이 = "+s.size()+"\n");
	}

}
