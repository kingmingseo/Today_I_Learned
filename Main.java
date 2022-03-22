package practice;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] studs = {
				new Student(14042, "김**", "융소",1),
				new Student(65242, "지**", "영문",2),
				new Student(55242, "박**", "일문",3),
				new Student(75242, "김**", "국문",4),
				new Student(64242, "최**", "경제",5)
		};
		
		Arrays.sort(studs);
		print(studs, "id");
		
		Arrays.sort(studs,Student.CompName);
		print(studs, "이름");
		
		Arrays.sort(studs, Student.CompDept);
		print(studs, "학과");
		
		Arrays.sort(studs, Student.CompGrade);
		print(studs, "학년");
		
	}
	public static void print(Student[] studs, String key) {
		System.out.println();
		System.out.println(key + "(으)로 정렬");
		System.out.println("------------");
		for(Student s: studs) {
			System.out.println( s.getId()+ " "+s.getName() + " "+ s.getDept() + "\t" + s.getGrade());
			}
		
		}
	}


