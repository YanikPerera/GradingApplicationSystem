package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;



public interface TeacherRepository extends JpaRepository<AssignmentsDomain,Integer> {
	
	//@Query("SELECT student_answer.answer FROM student_answer JOIN question ON student_answer.student_id = 1 AND student_answer.assignment_id = question.assignment_id AND student_answer.answer = question.answer AND student_answer.question_id = question.question_no");
   // String findByStudentidAndAssignmentidAndQuestionid(studentid,assignmentid,questionid);
	
	// we can proceed here our crud operations 
	//getALLusers
	//find-by-id
	//delete
	//update
	//custom query

}

