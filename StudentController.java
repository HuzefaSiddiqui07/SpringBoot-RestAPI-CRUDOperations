package com.springboot.crudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.crudoperation.model.Student;
import com.springboot.crudoperation.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/insert")  //  http://localhost:8082/student/insert
	public ResponseEntity<Student> insertStudent(@RequestBody Student student){
		Student std = studentService.insertStudent(student);
		return ResponseEntity.ok(std);
		}
	
	@GetMapping("/get/{id}")  //  http://localhost:8082/student/get/2
	public ResponseEntity<Student> getStudentById(@PathVariable("id") Integer id){
		Student std = studentService.getStudentById(id);
		return ResponseEntity.ok().body(std);
	 }
	
	@DeleteMapping("/delete/{id}")   //  http://localhost:8082/student/delete/3
	public void deleteStudentById(@PathVariable("id") Integer id) {
		studentService.deleteStudent(id);
	}
	
	@GetMapping("/getstdaddress/{stdAddress}")  //  http://localhost:8082/student/getstdaddress/mumbai
	public ResponseEntity<List<Student>> getStudentByStdAddress(@PathVariable("stdAddress") String stdAddress){
		List<Student> std = studentService.getListByStdAddress(stdAddress);
		return ResponseEntity.ok().body(std);
		
	}
}
