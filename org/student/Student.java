package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Sivam");
	}
	public void studentDept() {
		System.out.println("CSE");
	}
	public void StudentId() {
		System.out.println("1234");
	}
	public static void main(String[] args) {
		Student stu = new Student();
			stu.collegeCode();
			stu.collegeName();
			stu.collegeRank();
			stu.deptName();
			stu.studentName();
			stu.studentDept();
			stu.StudentId();
		}
}

