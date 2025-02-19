package com.SchoolProject.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "class_table")
public class ClassModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long class_id;
	private String class_name;
	private String section;
	private int class_strength;

	public ClassModel() {

	}

	public ClassModel(int class_id, String class_name, String section, int class_strength,
			List<StudentModel> students) {
		this.class_id = class_id;
		this.class_name = class_name;
		this.section = section;
		this.class_strength = class_strength;
	}
	public long getClass_id() {
		return class_id;
	}

	public void setClass_id(long class_id) {
		this.class_id = class_id;
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

	public int getClass_strength() {
		return class_strength;
	}

	public void setClass_strength(int class_strength) {
		this.class_strength = class_strength;
	}

}
