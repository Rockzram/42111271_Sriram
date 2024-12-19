package com.Encapsulation;

class Student{
	private int studentId;
	private String name;
	private int grade;
	Student(int studentId,String name,int grade){
		this.studentId = studentId;
		this.name = name;
		this.grade = grade;
	}
	public int studentId(){
		System.out.println("The id of the Student is :"+ this.studentId);
		return studentId;
	}
	public String name(){
		System.out.println("The name of the Student is :"+ this.name);
		return name;
	}
	public int grade(){
		System.out.println("The grade of the Student is :"+ this.grade);
		return grade;
	}
	void average_grade(){
		int avg_grade = grade / 5;
		System.out.println("The average grade is :" + avg_grade);
	}
}
public class Student_management_System {

	public static void main(String[] args) {
		Student s1 = new Student(200,"Sriram",50);
		s1.name();
		s1.average_grade();
	}

}
