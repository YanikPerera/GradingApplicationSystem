package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;



public interface QuestionRepository extends JpaRepository <QuestionDomain,Integer>{
	
//@Query("SELECT new com.example.GradingSystem.dto.Answerdto(c.name , p.productName) FROM StudentAnswerDomian c JOIN c.QuestionDomain p")
//public List<StudentAnswerDomian> getJoinInformation();
	
//	List<QuestionDomain> findByAssignmentidAndQuestionno(Integer assignmentid,Integer questionno);

}
