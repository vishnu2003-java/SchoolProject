package com.SchoolProject.listdto;

import java.util.List;

import com.SchoolProject.dto.StudentDTO;

public class StudentListDTO {

	/*
	 * private long student_id; private String student_name;
	 */
	private String class_name;

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public StudentListDTO(String class_name) {
		this.class_name = class_name;
	}

	public StudentListDTO() {

	}
	/*
	 * private String section; private int age; private List<StudentDTO>
	 * studentdtolist;
	 */

	/*
	 * public StudentListDTO(long student_id, String student_name, String
	 * class_name, String section, int age, List<StudentDTO> studentdtolist) {
	 * 
	 * this.student_id = student_id; this.student_name = student_name;
	 * this.class_name = class_name; this.section = section; this.age = age;
	 * this.studentdtolist = studentdtolist; } public long getStudent_id() { return
	 * student_id; }
	 * 
	 * public void setStudent_id(long student_id) { this.student_id = student_id; }
	 * 
	 * public String getStudent_name() { return student_name; }
	 * 
	 * public void setStudent_name(String student_name) { this.student_name =
	 * student_name; }
	 * 
	 * 
	 * public String getSection() { return section; }
	 * 
	 * public void setSection(String section) { this.section = section; }
	 * 
	 * public int getAge() { return age; }
	 * 
	 * public void setAge(int age) { this.age = age; }
	 * 
	 * public List<StudentDTO> getStudentdtolist() { return studentdtolist; }
	 * 
	 * public void setStudentdtolist(List<StudentDTO> studentdtolist) {
	 * this.studentdtolist = studentdtolist; }
	 */

}
