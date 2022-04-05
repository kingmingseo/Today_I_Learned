package CList;
import java.util.NoSuchElementException;

import SList.SNode;

public class CList <E> {
	private CNode last;
	private int size;
	
	public CList() {
		last = null;
		size = 0;
	}
	public boolean isEmpty() {
		if (size == 0) {
			return true;
		} else
			return false;
	}
	public void insert(E newItem) {
		CNode newNode = new CNode(newItem, null);
		
		if(last==null) {
			newNode.setNext(newNode);
			last=newNode;
			
		}
		else {
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}
	public void delete() {
		if(isEmpty()) throw new NoSuchElementException();
		
		CNode x= last.getNext();
		if( x==last)last = null;
		else {
			last.setNext(x.getNext());
		}
		size--;
		
		
	}

	public void print() {
		if( size >0) {
			int i =0;
			for (CNode p = last.getNext(); i<size; p=p.getNext(),i++) {
				System.out.println(p.getItem()+"\t");
				
			}
		}
		else
			System.out.println("리스트가 비어있음");
		System.out.println();
	}
	public int size() {
		return size;
	}
	


}
