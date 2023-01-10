package com.springboot.crudoperation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.crudoperation.dao.StudentRepository;
import com.springboot.crudoperation.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public Student insertStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Student getStudentById(Integer id) {
		Student student = studentRepository.findById(id).get();
		return student;
	}

	@Override
	public void deleteStudent(Integer id) {
		studentRepository.deleteById(id);
		
	}

	@Override
	public List<Student> getListByStdAddress(String stdAddress) {
		List<Student> student = studentRepository.findByStdAddress(stdAddress);
		return student;
	}

}
