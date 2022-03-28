package SList_ASM;

import java.util.NoSuchElementException;


public class SList<E extends Comparable<E>> {

	protected SNode head;
	private int size;

	public SList() {
		head = null;
		size = 0;

	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else
			return false;
	}

	public void DeleteAfter(SNode p) {
		if (p == null | p.getItem() == null) {
			throw new NoSuchElementException();
		}

		SNode t = p.getNext();
		p.setNext(t.getNext());
		t.setNext(null);

		size--;

	}

	public void DeleteFront() {
		if (isEmpty() == true) {
			throw new NoSuchElementException();
		}

		head = head.getNext();
		size--;

	}

	public void insertFront(E newItem) {
		head = new SNode(newItem, head);
		size++;
	}

	public void insertAfter(E newItem, SNode p) {
		p.setNext(new SNode(newItem, p.getNext()));
		size++;
	}

	public int search(E target) {
		SNode p = head;
		for (int k = 0; k < size; k++) {
			if (target == p.getItem())
				return k;
			p = p.getNext();
		}
		return -1;
	}

	public SNode search2(E target) {
		SNode p = head;
		for (int k = 0; k < size; k++) {
			if (target == p.getItem())
				return p;
			p = p.getNext();
		}
		return null;
	}

	public void print() {
		if (size > 0) {
			for (SNode p = head; p != null; p = p.getNext()) {
				System.out.print(p.getItem() + "\t");
			}
		} else {
			System.out.println("리스트가 비어있습니다.");
		}
		System.out.println();
	}
	
	public SNode mergeList(SNode p1, SNode p2) {
		
		if(p1==null) {return p2;}
		if(p2 == null) {return p1;}
	
		
		SNode result;
			if((p1.getItem().compareTo(p2.getItem())<=0)){
				if(head==null){size++;head=p1;}
				
				result=p1;
				size++;
				p1.setNext(mergeList(p1.getNext(),p2));
				
				
			}
			else {
				if(head==null){size++; head=p2;}
				result=p2;
				size++;
				p2.setNext(mergeList(p1,p2.getNext()));
				
			}
			
			return result;
			
			
	}
	
	public void splitList(SNode p, int k, SList L1, SList L2) {
		SNode result_1;
		SNode result_2;
	
			if(p==null) {break;}
			
			if((p.getItem().compareTo(k))<=0){
				if(L1.head==null) {size++; L1.head=p;}
				result_1=p;	
				L1.insertFront(p);
				size++;
				
				
			}
			else {
				if(L2.head==null) {size++; L2.head=p;}
				
				
				p=p.getNext();
				size++;
				
			}
		}
			
			
		
		
		
	}
	
	     
	
		
		
	
		
	
	


}
