
public class Travel {
	private Node start;
	public Travel() { start=null;}
	public class Node{
		private char name;
		private Node left,right;
		public Node(char newIsland,Node lt,Node rt) {
			this.name=newIsland;
			this.left=lt;
			this.right=rt;
		}
	}
	public Node map() {
		Node h= new Node('H',null,null); Node f= new Node('F',null,null);
		Node s= new Node('S',null,null); Node u= new Node('U',null,null);
		Node e= new Node('E',null,null); Node z= new Node('Z',null,null);
		Node k= new Node('K',null,null); Node n= new Node('N',null,null);
		Node a= new Node('A',null,null); Node y= new Node('Y',null,null);
		Node t= new Node('T',null,null);
		
		h.left=f; h.right=s;
		f.left=u; f.right=e;
		u.left=n; e.left=a;
		a.right=t; s.left=z; s.right=k; k.right=y;
		return h;
	}
	
	public void A_course(Node n) {
		if(n!=null) {
			System.out.print(n.name+"-> ");
			A_course(n.left);
			A_course(n.right);
		}
	}
		
		public void B_course(Node n) {
			if(n!=null) {
				B_course(n.left);
				System.out.print(n.name+"-> ");
				B_course(n.right);
			}
		}
		public void C_course(Node n) {
			if(n!=null) {
				C_course(n.left);
				C_course(n.right);
				System.out.print(n.name+"-> ");
				}		
		
		
	}
	public static void main(String[] args) {
		Travel t= new Travel();
		t.start=t.map();
		System.out.print("A코스로 이동 경로 = ");
		t.A_course(t.start);
		System.out.println("\n");
		System.out.print("B코스로 이동 경로 = ");
		t.B_course(t.start);
		System.out.println("\n");
		System.out.print("C코스로 이동 경로 = ");
		t.C_course(t.start);
	}
}