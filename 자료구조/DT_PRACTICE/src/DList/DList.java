package DList;


import java.util.NoSuchElementException;

public class DList <E> {
	protected DNode head, tail;
	protected int size;
	public DList() {
		head = new DNode(null, null, null);
		tail = new DNode(null, head, null);
		head.setNext(tail);
		size=0;
	}
	public int size() {return size;}
	public boolean isEmpty() { return size==0;}
	
	public void insertBefore(DNode p, E newItem) {
		DNode t= p.getPrevious();
		DNode newNode= new DNode(newItem, t,p);
	    p.setPrevious(newNode);
		t.setNext(newNode);
		size++;
	}
	
	public void insertAfter(DNode p, E newItem) {
		DNode t= p.getNext();
		DNode newNode= new DNode(newItem, p,t);
	    t.setPrevious(newNode);
		p.setNext(newNode);
		size++;
	}
		
	public void delete(DNode x) {
		if (x==null) {
			throw new NoSuchElementException();}
		
		DNode f= x.getPrevious();
		DNode r= x.getNext();
		f.setNext(r);
		r.setPrevious(f);
		size--;
		
		
	}
	
	public void print() {
		if(size >0) {
			for(DNode p = head.getNext(); p!=tail; p=p.getNext()) {
				System.out.println(p.getItem()+"\t");
			}
		}
		else {
			System.out.println("리스트가 비어있습니다.");
		}
		System.out.println();
	}


}
