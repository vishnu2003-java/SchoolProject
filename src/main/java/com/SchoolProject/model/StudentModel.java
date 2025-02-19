package com.SchoolProject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_table")
public class StudentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long student_id;
	private int class_id;
	private String student_name;
	private String class_name;
	private String section;
	private int age;

	public StudentModel(long student_id, String student_name, String class_name, String section, int age,int class_id) {

		this.student_id = student_id;
		this.class_id=class_id;
		this.student_name = student_name;
		this.class_name = class_name;
		this.section = section;
		this.age = age;
	}

	public int getClass_id() {
		return class_id;
	}

	public void setClassroom_id(int class_id) {
		this.class_id = class_id;
	}

	public StudentModel() {

	}

	public long getStudent_id() {
		return student_id;
	}

	public void setStudent_id(long student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getClass_name() {
		return class_name;
	}

	public void setClass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
