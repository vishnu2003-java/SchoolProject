package com.SchoolProject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SchoolProject.dto.StudentDTO;
import com.SchoolProject.listdto.StudentListDTO;
import com.SchoolProject.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentsrvice;

	@PostMapping("/addstd")
	public String addStd(@RequestBody List<StudentDTO> studentdto) {
		return studentsrvice.saveStd(studentdto);
	}

	@PostMapping("/filterbyclassname")
	public List<StudentDTO> findStudentByClassName(@RequestBody StudentListDTO studentlistdto) {

		return studentsrvice.findStudentBydClassName(studentlistdto);
	}
}
