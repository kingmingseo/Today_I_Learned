package practice;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Student[] studs = {
				new Student(14042, "��**", "����",1),
				new Student(65242, "��**", "����",2),
				new Student(55242, "��**", "�Ϲ�",3),
				new Student(75242, "��**", "����",4),
				new Student(64242, "��**", "����",5)
		};
		
		Arrays.sort(studs);
		print(studs, "id");
		
		Arrays.sort(studs,Student.CompName);
		print(studs, "�̸�");
		
		Arrays.sort(studs, Student.CompDept);
		print(studs, "�а�");
		
		Arrays.sort(studs, Student.CompGrade);
		print(studs, "�г�");
		
	}
	public static void print(Student[] studs, String key) {
		System.out.println();
		System.out.println(key + "(��)�� ����");
		System.out.println("------------");
		for(Student s: studs) {
			System.out.println( s.getId()+ " "+s.getName() + " "+ s.getDept() + "\t" + s.getGrade());
			}
		
		}
	}


