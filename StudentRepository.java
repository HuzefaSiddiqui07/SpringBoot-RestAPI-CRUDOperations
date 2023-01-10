package com.springboot.crudoperation.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.crudoperation.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	@Query(value = "select * from student s where std_address = ?", nativeQuery = true)
	List<Student> findByStdAddress(String stdAddress);

}
