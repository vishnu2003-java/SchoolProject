package com.SchoolProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolProject.dto.ClassDTO;
import com.SchoolProject.join.ClassJoinFields;
import com.SchoolProject.listdto.ClassListDTO;
import com.SchoolProject.service.ClassService;

@RestController
@RequestMapping("/class")
public class ClassController {

	@Autowired
	private ClassService classservice;

	@PostMapping("/add")
	public String addClasses(@RequestBody List<ClassDTO> classdto) {

		return classservice.saveClass(classdto);
	}

	@PostMapping("/jointable")
	public List<ClassJoinFields> joinTable(@RequestBody ClassListDTO classlistdto) {

		return classservice.findByJoinClassId(classlistdto);
	}
}
