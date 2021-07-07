package com.example.GradingSystem.Teachers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;
import com.example.GradingSystem.Teachers.repository.TeacherServiceRepo;

@RestController
@RequestMapping("/assignment")
@ControllerAdvice
public class TeacherController {
	@Autowired
	private TeacherServiceRepo teacherservicerepo;
	
@GetMapping("/allassignment")	
public List<AssignmentsDomain> AllAssignments() {
	 
	return teacherservicerepo.AllAssignments();

	}


@PostMapping("/addassignment")
public String addUser(@RequestBody AssignmentsDomain addAssignment) {
	
	return teacherservicerepo.SaveAssignment(addAssignment);	
	
}

@GetMapping("/seequez")	
public List<QuestionDomain> Questionfunc() {
	
	return teacherservicerepo. Questionfunc();

	}

@PostMapping("/addquestion")
public String addQuestion(@RequestBody QuestionDomain addQuecstion) {
	
	return teacherservicerepo.SaveQuesction(addQuecstion);	
	
}

@RequestMapping(path = "/studentgrade/{studentid}/{assignmentid}", method = RequestMethod.GET)
@GetMapping("/studentgrade")	
public String StudentGrade( @PathVariable  Integer studentid, @PathVariable  Integer assignmentid) {
	
	return teacherservicerepo.StudentGrade(studentid,assignmentid);

	}

@GetMapping("/staticanswer")	
public List<QuestionDomain> StaticAnswer() {
	
	return teacherservicerepo.StaticAnswer();

	}

}
