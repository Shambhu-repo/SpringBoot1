
package com.learning.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.service.StudentDto;
import com.learning.service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/findAllStudents")
	public String getAllStudent(Model model) {
		// call service to get student list
		List<StudentDto>  students = studentService.getAllStudents();
		// set list in request
		model.addAttribute("studentList",students);
		return "showAllStudents";
	}
	
	@GetMapping("/studentDetail")
	public String getStudent(@RequestParam int studentid,Model model) {
		
		// get student details from service
		StudentDto dto =  studentService.getStudent(studentid);
		//pass the student in request
		model.addAttribute("student",dto);
		return "studentDetails";
	}
	
	@GetMapping("/register")  // it will give registraion form
	public String register() {
		return "registration";
	}
	
	@PostMapping("/register")  // it will post student data in registration form
	public String studentRegistration(@ModelAttribute StudentDto dto,Model model) {
	String message =	studentService.registration(dto);
		model.addAttribute("message", message);
		return "registration";
		
		
	}
	
	@GetMapping("/updateStudent")
	public String updateStudent(@RequestParam int studentId, Model model) {
			StudentDto  dto = studentService.getStudent(studentId);
       		model.addAttribute("student", dto);
		    return "updateStudentDetails";
	}
	
	@PostMapping("/updateStudent")
	public String editStudent(@ModelAttribute StudentDto dto,  Model model) {
		String message = studentService.updateStudent(dto);
		model.addAttribute("message", message);
		return "updateStudentDetails";
	}	
	
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam int studentid, Model model) {
		String message = null;
		try {
			studentService.deleteStudent(studentid);
			message = "Student has been deleted";
		} catch (Exception e) {
			message = "Some error in Student deletion";
		}
		model.addAttribute("message", message);
		return "showAllStudents";
	}
	
	@GetMapping("/login") // 
	public String login() {
		return "login";
	}

	
	@PostMapping("/authentication")
	public String authentication(@RequestParam String email,@RequestParam String password, Model model, HttpSession session)
	{
		StudentDto dto =studentService.authenticate(email, password);
		if(dto!=null) {
			model.addAttribute("student", dto);
			session.setAttribute("studentData", dto);
			return "studentDetails";
		}
		else {
			model.addAttribute("message", "Email or password is incorrect");
			return "login";
		}
		
	}
	
	 @GetMapping("/logout")
	    public String logout(HttpSession session) {
	        
	        if (session != null) {
	            session.invalidate();
	        }
	        return "login";
	    }
	 
	
	 @GetMapping("/auth")
	    public String home () {  // my application can run without it, because
		                            // i can call home page from bellow getMapping
	       return "login";

	      // return "welcome";
		// return "login";
	    }
	 
//	 @GetMapping("/")
//	 public String welcome() {
//		 return "welcome";
//	 }
//	 
	 
	 
	
	
}

	
	
	


