package SList;

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

}
