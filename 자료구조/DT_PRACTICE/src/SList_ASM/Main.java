	package SList_ASM;

public class Main {
	public static void main(String[] args) {
		SList<Integer> List_1 = new SList<Integer>();
		SList<Integer> List_2 = new SList<Integer>();
		SList<Integer> merged_List = new SList<Integer>();
		SList<Integer> Single_List = new SList<Integer>();
		SList<Integer> List_3 = new SList<Integer>();
		SList<Integer> List_4 = new SList<Integer>(); 
		
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
		Single_List.insertFront(45);
		Single_List.insertFront(17);
		Single_List.insertFront(20);
		Single_List.insertFront(50);
		Single_List.insertFront(57);
		Single_List.insertFront(35);
		Single_List.insertFront(10);
		Single_List.insertFront(15);
		Single_List.insertFront(90);
		Single_List.insertFront(10);
		merged_List.mergeList(List_1.head, List_2.head);
		System.out.print("Merged_List 3:  ");
		merged_List.print();
		System.out.println("-------------------");
		
		System.out.print("Single List :  ");
		Single_List.print();
		System.out.println("k=20을 기준으로 두 개의 리스트로 분리:");
		Single_List.splitList(Single_List.head, 20, List_3, List_4);
		
		List_3.print();
		System.out.println(List_3.head.getNext().getItem());
	
		
		
		
	
		
	
		

	}
}
