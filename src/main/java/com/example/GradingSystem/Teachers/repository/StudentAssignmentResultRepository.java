package com.example.GradingSystem.Teachers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;

public interface StudentAssignmentResultRepository extends JpaRepository<StudentAnswerDomian, Integer> {
	
	@Query(value = "SELECT COUNT(student_answer.answer) FROM student_answer JOIN question ON student_answer.studentid_pk =?1 AND student_answer.assignmenqtidstanswer_fk =?2 AND student_answer.answer = question.answer AND question.assignmenqtid_fk =student_answer.assignmenqtidstanswer_fk AND student_answer.questionid_pk = question.question_no", 
	nativeQuery = true)
    public StudentAnswerDomian findByAnsweridAndStudentid(Integer studentid_pk,Integer assignmenqtidstanswer_fk);
	
	@Query(value = "SELECT COUNT(student_answer.answer_id) FROM student_answer JOIN question ON student_answer.studentid_pk =?1 AND student_answer.assignmenqtidstanswer_fk =?2 AND student_answer.answer = question.answer AND question.assignmenqtid_fk =student_answer.assignmenqtidstanswer_fk AND student_answer.questionid_pk = question.question_no", 
	nativeQuery = true)
    public StudentAnswerDomian findByGrades(Integer studentid_pk,Integer assignmenqtidstanswer_fk);

}
