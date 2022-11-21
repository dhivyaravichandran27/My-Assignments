package week3.day1.org.student;

import week3.day1.org.department.*;

public class Student extends Department {
	public void studentName(){
		System.out.println("Raja");
	}
	public void studentDept(){
		System.out.println("Computer science Department");
	}
	public void studentId(){
		System.out.println("Student id is 1201");
	}

	public static void main(String[] args) {
		Student stu =new Student();
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.deptName();
		stu.studentName();
		stu.studentDept();
		stu.studentId();

	}

}
