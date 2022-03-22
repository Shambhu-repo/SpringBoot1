package com.learning.service;

import java.util.List;


//import com.mvc.learning.repository.StudentEntity;

public interface StudentService {
	
public List<StudentDto> getAllStudents();
	
public StudentDto getStudent(int studentId);

public String registration(StudentDto dto);

public String updateStudent(StudentDto dto);

public void deleteStudent(int studentId) throws Exception ;

public StudentDto authenticate(String email, String password);

// String saveproduct();



}
