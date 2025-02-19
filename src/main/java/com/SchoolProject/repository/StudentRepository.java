package com.SchoolProject.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.SchoolProject.model.StudentModel;

@Repository
public interface StudentRepository extends JpaRepository<StudentModel,Long>{
	
	@Query(value = "select * from student_table where class_name = :class_name",nativeQuery = true)
	List<StudentModel> findByClassName(@Param("class_name") String class_name);
	
}
