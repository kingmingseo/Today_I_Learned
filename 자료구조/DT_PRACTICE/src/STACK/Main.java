//자료구조 과제 #3 60191645김민서
package STACK;

import java.util.ArrayList;

public class Main {
		public static void test(String s) {
			ListStack<Character> stack = new ListStack<Character>();
			
			ArrayList<Integer> a=new ArrayList<Integer>();
			for(int i=0; i<s.length(); i++) {
				if(i==0 && (s.charAt(i)=='}' ||s.charAt(i)==')')) {       // 정상적인 스트링에서 닫히는 괄호가 제일 앞에있을경우
					
					a.add(i);
					
				
				}
				 if((s.charAt(i)=='{'||s.charAt(i)=='(') && i+1==s.length()) {  //정상적인 스트링에서  열리는 괄호가 제일 뒤에 있을 경우 
					
						a.add(i);
						
						}
				 
				 if((s.charAt(i)=='}'||s.charAt(i)==')') && stack.isEmpty()==true) {  //정상적인 스트링에서  닫히는 괄호가 제일 뒤에 있을 경우 
					 	
						a.add(i);
					}
				
				
				
				
				if(s.charAt(i)=='{' ||s.charAt(i)=='(') {          
					stack.push(s.charAt(i));
				}
		
				else if((s.charAt(i)==')'&& stack.peek()=='(')) {
					stack.pop();}
				else if((
						s.charAt(i)=='}'&& stack.peek()=='{')) {
					stack.pop();}
				else { a.add(i);}
				
				}
			
			
			
			if (stack.isEmpty()==true) {System.out.println("괄호의 짝이 맞다");}
			
			else  if(stack.size()>0) {
				 	for(int i=0; i<stack.size(); i++) {a.add(i);}
					
				  	
				 	for(int i=0; i<a.size(); i++) {System.out.println(s+" 에서 "+(a.get(i)+1)+"번째가 짝이 맞지 않는다");}
				
			}
			
			
		}
		
	public static void main(String[] args) {
		test("{{(){()}}}");
		test("{{(){()})()}(");
	
	}
}
