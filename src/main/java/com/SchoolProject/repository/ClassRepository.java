package com.SchoolProject.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.SchoolProject.model.ClassModel;

@Repository
public interface ClassRepository extends JpaRepository<ClassModel, Long> {

	@Query(value = "select st.student_id,st.student_name,st.age,cl.class_name,cl.section " + "from student_table st "
			+ "INNER JOIN class_table cl ON st.class_id = cl.class_id "
			+ "where cl.class_id = :class_id", nativeQuery = true)
	List<Object[]> findByClassId(Long class_id);

	@Query(value = "select st.student_id,st.student_name,st.age,cl.class_name,cl.section " + "from student_table st "
			+ "INNER JOIN class_table cl ON st.class_id = cl.class_id "
			+ "where cl.class_id = :class_id", nativeQuery = true)
	Page<Object[]> findByClassId(Long class_id,Pageable peageable);
	
}
