package com.springboot.crudoperation.service;

import java.util.List;

import com.springboot.crudoperation.model.Student;

public interface StudentService {
	
	// Create Abstract Method
	
	public Student insertStudent(Student student);   // POST or INSERT-Operation
	
	public Student getStudentById(Integer id);   // GET or SELECT or RETRIEVE-Operation
	
	public void deleteStudent(Integer id);   // DELETE-Operation
	
	public List<Student> getListByStdAddress(String stdAddress);   // NATIVE QUERY-Operation

}
