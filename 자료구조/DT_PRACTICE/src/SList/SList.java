package SList;

import java.util.NoSuchElementException;

import DList.DNode;

public class SList<E extends Comparable<E>> {
	
	protected SNode head;
	private int size;
	
	public SList() {
		head= null;
		size = 0;
		
	}
	public boolean isEmpty() {
		if (size ==0) {return true;}
		else return false;
		
		
		
	}
	
	public void DeleteAfter(SNode p) {
		if(p==null|p.getItem()==null) {throw new NoSuchElementException();}
		
			SNode t=p.getNext();
			p.setNext(t.getNext());
			t.setNext(null);
			
		}
	public void DeleteFront() {
		if(isEmpty()==true) {throw new NoSuchElementException();}
		
			head=head.getNext();
			size--;
			
		}
	
	
	public void insertFront(E newItem) {
		head=new SNode(newItem,head);
		size++;
	}
	
	public void insertAfter(E newItem,SNode p) {
		p.setNext(new SNode(newItem, p.getNext()));
		size++;
	}
	public int search(E target) {
		SNode p= head;
		for (int k=0; k< size; k++) {
			if(target ==p.getItem()) return k;
			p = p.getNext();
		}
		return -1;
	}
	
	public void print() {
		if(size >0) {
			for(SNode p = head; p!=null; p=p.getNext()) {
				System.out.println(p.getItem()+"\t");
			}
		}
		else {
			System.out.println("리스트가 비어있습니다.");
		}
		System.out.println();
	}

}
