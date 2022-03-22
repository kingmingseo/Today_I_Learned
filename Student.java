package practice;

import java.util.Comparator;

public class Student implements Comparable<Student>{
	protected int id;
	String name; 
	protected String dept;
	protected int grade;
	
	public Student(int id, String name,String dept, int grade) {
		this.id=id;
		this.name=name;
		this.dept =dept;
		this.grade=grade;
		}
	
	public int getId() {return id;}
	public String getName() {return name;}
	public String getDept() {return dept;}
	public int getGrade() {return grade;}
	
	public int compareTo(Student s) {
		return this.id -s.id;
	}
	public static Comparator<Student> CompName = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			return s1.name.compareTo(s2.name);
		}
	};
	public static Comparator<Student> CompDept = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			return s1.dept.compareTo(s2.dept);
		}
	};
	public static Comparator<Student> CompGrade = new Comparator<Student>() {
		public int compare(Student s1, Student s2) {
			return s1.grade-(s2.grade);
		}
	};
} 
