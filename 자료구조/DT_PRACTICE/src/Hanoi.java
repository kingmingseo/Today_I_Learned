import java.util.Scanner;

public class Hanoi {
	public static void Hanoi(int num,String start,String mid,String end) {
		if(num==1) {
			System.out.println("원반 "+num+"이 "+start+"에서 "+end+"로 이동");
			return ;
		}
		
		Hanoi(num-1,start,end,mid);
		System.out.println("원반 "+num+"이 "+start+"에서 "+end+"로 이동");
		Hanoi(num-1,mid,start,end);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("원반의 개수를 입력해주세요");
		int num=sc.nextInt();
		System.out.println("원반이 "+num+"개인 경우");
		Hanoi(num,"A","B","C");
	
		
		
	}

}
