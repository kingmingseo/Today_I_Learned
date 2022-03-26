package SList_ASM;

import java.util.NoSuchElementException;

import DList.DNode;

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
	
	public SNode mergeList(SNode l1, SNode l2) {
	        if (l1 == null){
	            return l2;
	        }
	        if(l2 == null){
	            return l1;
	        }
	        
	        SNode nextNode = l1;
	        while(true){
	            System.out.print(nextNode.getItem()+" ");
	            if (nextNode.getNext() != null){
	                nextNode = nextNode.getNext();
	            }else{
	                break;
	            }
	        }
	        
	        

	        
	        SNode nextNode2 = l2;
	        while(true){
	            System.out.print(nextNode2.getItem()+" ");
	            if (nextNode2.getNext() != null){
	                nextNode2 = nextNode2.getNext();
	            }else{
	                break;
	            }
	        }
	        
	        
	        return null;
	    }
	
		
	
		
	
	
	public void splitList(SNode p1, SNode p2) {
		
	}


}
