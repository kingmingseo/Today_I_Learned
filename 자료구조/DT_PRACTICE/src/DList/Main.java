package DList;

public class Main {
	public static void main(String[] args) {
		DList<String> a = new DList<String>();
		a.insertAfter(a.head,"apple");
		a.insertBefore(a.tail,"orange");
		a.insertBefore(a.tail,"cherry");
		a.insertAfter(a.head.getNext(),"pear");
		a.print();
		System.out.println();
		
		a.delete(a.tail.getPrevious());
		a.print();
		a.delete(a.head.getNext());
		a.print();
		a.delete(a.head.getNext());
		a.delete(a.head.getNext());
		a.print();
		
	}
}