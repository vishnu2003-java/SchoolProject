package com.SchoolProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SchoolProject.dto.StudentDTO;
import com.SchoolProject.listdto.StudentListDTO;
import com.SchoolProject.model.StudentModel;
import com.SchoolProject.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepo;

	public String saveStd(List<StudentDTO> studentdto) {

		List<StudentModel> stdmodel = new ArrayList<>();

		for (StudentDTO studentdto1 : studentdto) {

			StudentModel studentModelobj = new StudentModel();

			studentModelobj.setStudent_name(studentdto1.getStudent_name());
			studentModelobj.setAge(studentdto1.getAge());
			studentModelobj.setClass_name(studentdto1.getClass_name());
			studentModelobj.setSection(studentdto1.getSection());

			stdmodel.add(studentModelobj);
		}
		if (!stdmodel.isEmpty()) {
			studentrepo.saveAll(stdmodel);
			return "Record Submitted";
		} else {
			return "Record Not Submitted";
		}
	}

	public List<StudentDTO> findStudentBydClassName(StudentListDTO studentlistdto) {
		List<StudentDTO> studentdtoArrayList = new ArrayList<>();
		List<StudentModel> stdmodel = new ArrayList<>();
		if (studentlistdto.getClass_name() != null && !studentlistdto.getClass_name().isEmpty()) {
			stdmodel = studentrepo.findByClassName(studentlistdto.getClass_name());
		}

		for (StudentModel stdmodel1 : stdmodel) {
			StudentDTO studentdto = new StudentDTO();

			studentdto.setClass_name(stdmodel1.getClass_name());
			studentdto.setStudent_id(stdmodel1.getStudent_id());
			studentdto.setStudent_name(stdmodel1.getStudent_name());
			studentdto.setAge(stdmodel1.getAge());
			studentdto.setSection(stdmodel1.getSection());

			studentdtoArrayList.add(studentdto);
		}
		return studentdtoArrayList;
	}
}
