package model;

import bean.Student;

public class StudentModel {
	
	public StudentModel() {
		
	}
	
	public boolean check(Student student) {
		if ("639987".equals(student.getmSV())) {
			return true;
		}else {
			return false;
		}
	}
}
