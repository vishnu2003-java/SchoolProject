package com.SchoolProject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.SchoolProject.dto.ClassDTO;
import com.SchoolProject.join.ClassJoinFields;
import com.SchoolProject.listdto.ClassListDTO;
import com.SchoolProject.model.ClassModel;
import com.SchoolProject.repository.ClassRepository;

@Service
public class ClassService {

	@Autowired
	private ClassRepository classrepo;

	public String saveClass(List<ClassDTO> classdto) {

		List<ClassModel> classmodelList = new ArrayList<>();
		for (ClassDTO classdto1 : classdto) {
			ClassModel classmodel = new ClassModel();

			classmodel.setClass_name(classdto1.getClass_name());
			classmodel.setClass_strength(classdto1.getClass_strength());
			classmodel.setSection(classdto1.getSection());

			classmodelList.add(classmodel);

		}
		classrepo.saveAll(classmodelList);
		if (!classmodelList.isEmpty()) {
			return "Record Submitted";
		} else {
			return "Record Not Submitted";
		}

	}

	public List<ClassJoinFields> findByJoinClassId(ClassListDTO classlistdto) {
		Page<Object[]> page = Page.empty();
		Pageable pageable = PageRequest.of(classlistdto.getPage() - 1, classlistdto.getSize());
		List<Object[]> joinfields = new ArrayList<>();
		List<ClassJoinFields> classjoined = new ArrayList<>();

		if (classlistdto.getClass_id() > 0) {

			joinfields = classrepo.findByClassId(classlistdto.getClass_id());
		} else if (classlistdto.getPage() > 0 && classlistdto.getSize() > 0 && classlistdto.getClass_id() > 0
				&& classlistdto.getClass_id() > 0) {
			page = classrepo.findByClassId(classlistdto.getClass_id(), pageable);
			joinfields.addAll(page.getContent());
		}
		if (!joinfields.isEmpty()) {
			for (Object[] joinedObj1 : joinfields) {

				ClassJoinFields classjoinfields = new ClassJoinFields();

				classjoinfields.setStudent_id((long) joinedObj1[0]);
				classjoinfields.setStudent_name((String) joinedObj1[1]);
				classjoinfields.setAge((int) joinedObj1[2]);
				classjoinfields.setClass_name((String) joinedObj1[3]);
				classjoinfields.setSection((String) joinedObj1[4]);

				classjoined.add(classjoinfields);

			}
		}
		System.out.println(joinfields.size());
		return classjoined;
	}

}
