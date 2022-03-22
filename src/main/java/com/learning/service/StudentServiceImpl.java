package com.learning.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.repository.StudentEntity;
import com.learning.repository.StudentRepository;


@Service
@Transactional   
public class StudentServiceImpl implements StudentService {
   @Autowired
	//StudentRepositoryImpl studentRepository; // 
   StudentRepository studentRepository;   
	
   public List<StudentDto> getAllStudents() {
		//List<StudentDto> studentDtos = new ArrayList<StudentDto>();
		List<StudentEntity> students = (List<StudentEntity>)studentRepository.findAll(); // findAll() , inbuilt method
		List<StudentDto> studentDtos = new ArrayList<StudentDto>();

		for(StudentEntity entity:students) {
			StudentDto dto = new StudentDto();
			BeanUtils.copyProperties(entity, dto);
			studentDtos.add(dto);
		}
		
		return studentDtos;
	}

	public StudentDto getStudent(int studentId) {
		StudentDto dto = new StudentDto();
	Optional<StudentEntity> entity=	studentRepository.findById(studentId);
	if(entity.isPresent()) {
		BeanUtils.copyProperties(entity.get(), dto);
}
	

		return dto;
	}

	public String registration(StudentDto dto) {  // we have to get student data from outside not from backend database 
		                                          // so the flow is just reverse from dto to studentEntity
		StudentEntity entity = new StudentEntity();
		BeanUtils.copyProperties(dto,entity);
		String message ;
		try {
			studentRepository.save(entity);
            message="Student created in db";
		}
		 catch (Exception e) {
				message = "Some error in inset student";
			}
return message;
	}

	public String updateStudent(StudentDto dto) {
		StudentEntity entity = new StudentEntity();
		//StudentDto dto = new StudentDto();
		BeanUtils.copyProperties(dto, entity);
		studentRepository.save(entity);
	  String message="Student update in database";
	  return message;
		
     
	}
	
	public void deleteStudent(int studentId) throws Exception {
		studentRepository.deleteById(studentId);
		
	}

	public StudentDto authenticate(String email, String password) {
		StudentDto  dto = null;
		Optional<StudentEntity> entity=  studentRepository.findByEmailAndPassword(email, password);		
if(entity.isPresent()){
	dto=new StudentDto();
	BeanUtils.copyProperties(entity.get(), dto); //.get provides data from optional
}
return dto;

	}

	
}


