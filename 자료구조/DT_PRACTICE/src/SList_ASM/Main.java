	package SList_ASM;

public class Main {
	public static void main(String[] args) {
		SList<Integer> List_1 = new SList<Integer>();
		SList<Integer> List_2 = new SList<Integer>();
		SList<Integer> merged_List = new SList<Integer>();
		List_1.insertFront(50);
		List_1.insertFront(40);
		List_1.insertFront(30);
		List_1.insertFront(20);
		List_1.insertFront(10);
		System.out.print("Sotred List 1:  ");
		List_1.print();
		List_2.insertFront(55);
		List_2.insertFront(37);
		List_2.insertFront(35);
		List_2.insertFront(18);
		List_2.insertFront(15);
		System.out.print("Sotred List 2:  ");
		List_2.print();
		System.out.println(List_1.head.getItem());
		merged_List.mergeList(List_1.head, List_2.head);
		

	}
}
