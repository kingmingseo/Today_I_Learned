// 자료구조 과제#2 60191645 김민서



package SList_ASM;

public class SNode<E extends Comparable<E>> {
	private E item;
	private SNode next;
	
	
	public SNode(E newItem, SNode p) {
		item=newItem;
		next=p;
		
	}
	
	public E getItem() {return item;}
	public SNode<E> getNext() {return next;}
	public void setItem(E newItem) {item=newItem;}
	public void setNext(SNode k) {next=k;}
	public int compareTo(SNode head) {
		return (int)this.item-(int)head.getItem();	
		
	}
	public int compareTo(int k) {
		return (int)this.item-(int)k;	
		
	}

}
