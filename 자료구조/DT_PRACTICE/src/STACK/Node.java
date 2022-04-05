//자료구조 과제 #3 60191645김민서
package STACK;

import java.util.EmptyStackException;

import SList.SNode;

public class Node<E> {
	private E item;
	private Node<E> next;
	
	
	public Node(E newItem, Node<E> node) {
		item= newItem;
		next=node;
	}
	
	public E getItem() {return item;}
	public Node<E> getNext() {return next;}
	public void setItem(E newItem) {item=newItem;}
	public void setNext(Node k) {next=k;}


}

