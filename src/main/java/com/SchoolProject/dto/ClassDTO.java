package com.SchoolProject.dto;

public class ClassDTO {

	private long class_id;
	private String class_name;
	private String section;
	private int class_strength;

	public ClassDTO() {

	}
	public ClassDTO(int class_id, String class_name, String section, int class_strength) {
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
