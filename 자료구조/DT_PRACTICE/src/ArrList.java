//자료구조 3주차 출석과제(김민서 60191645)

import java.util.NoSuchElementException;

public class ArrList<E> {
	private E a[];
	private int size;

	public ArrList() {
		a = (E[]) new Object[1]; // E에서 지정해준 객체 형태로 Type Cast
		size = 0;
		
	}
	
	public E peek(int k) {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		System.out.println(k+"번째 항목은 "+a[k]+"이다");
			return a[k];
			}
		
	public boolean isEmpty() {
		return size==0;
	}
	
	public void insertLast(E newItem) {
		if (size == a.length) {
			resize(2*a.length);
			
			a[size++]=newItem;
		}
	}
	public void insert(E newItem , int k) {
		if (size == a.length) {
			resize(2*a.length);			
		}
		for (int i = size-1; i>=k; i--) {
			a[i+1]=a[i];}
		
		a[k]=newItem;
		size++;
		}
	
	public void resize(int newSize) {
		Object[] t = new Object[newSize];
		for(int i=0; i<size; i++) {
			t[i]=a[i];
		}
		a=(E[])t;
	}
	public E delete(int k) {
		if (isEmpty()) {
			throw new NoSuchElementException();
		}
		
		E item= a[k];
		
		for(int i=k; i<size; i++) {
			a[i]=a[i+1];
		}
		size--;
		
		if(size>0 && size == a.length/4)
			resize(a.length/2);
		return item;
		
	}
		
	public void print() {
		if(size==0) {
			System.out.println("배열이 비어있습니다.");
		}
		else {
		for(int i=0; i<a.length; i++) {
			System.out.print(a[i ]+" ");
		}
		System.out.print("\n");
	}
	}
			
	
	public static void main(String[] args) {
		ArrList<String> t=new ArrList<String>();
		t.insert("A",0); t.print();
		t.insert("b",1); t.print();
		t.insertLast("b"); t.print();
		t.peek(1);
		t.delete(1); t.print();
		t.delete(0); t.print();
		t.delete(0); t.print();
		
	
	}


}