package com.SchoolProject.listdto;

import java.util.List;

import com.SchoolProject.join.ClassJoinFields;

public class ClassListDTO {
    private int page;
    private int size;
    private List<ClassJoinFields> JoinedColumns;
    
	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public List<ClassJoinFields> getJoinedColumns() {
		return JoinedColumns;
	}

	public void setJoinedColumns(List<ClassJoinFields> joinedColumns) {
		JoinedColumns = joinedColumns;
	}

	private long class_id;

	public ClassListDTO() {
		super();
	}

	public ClassListDTO(long class_id) {
		super();
		this.class_id = class_id;
	}

	public long getClass_id() {
		return class_id;
	}

	public void setClass_id(long class_id) {
		this.class_id = class_id;
	}
	
}
