package com.example.GradingSystem.Teachers.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.COUNT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;
import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.repository.QuestionRepository;
import com.example.GradingSystem.Teachers.repository.StudentAssignmentResultRepository;
import com.example.GradingSystem.Teachers.repository.TeacherServiceRepo;

@Service
public class TeacherService implements TeacherServiceRepo {
	

	@Autowired
	private QuestionRepository questionrepository;
	
	@Autowired
	private StudentAssignmentResultRepository studentassignmentresultrepository;

	
//********************************TEACHER GET STATIC ON ANSWER************************************		
	
	@Override
	public String GetStaticOnAnswer(Integer studentid_pk, Integer assignmenqtidstanswer_fk) {
		
		StudentAnswerDomian allanswers = studentassignmentresultrepository.findByAnsweridAndStudentid(studentid_pk,assignmenqtidstanswer_fk);
		// TODO Auto-generated method stub
		
		//return COUNT(allanswers);
		
		return null;
	}
	
//********************************TEACHER GET GRADE FOR THE ASSIGNMENT************************************	

	@Override
	public String GetGradeOnAssignment(Integer studentid_pk, Integer assignmenqtidstanswer_fk) {
		
		StudentAnswerDomian allanswerss = studentassignmentresultrepository.findByGrades(studentid_pk,assignmenqtidstanswer_fk);
		// TODO Auto-generated method stub
		
		if(allanswerss.getAnswer()>3) {
			
			return "Pass";
		}
		return "Fail";
	}
	
	
	
	
	
	
	
	
	
	
	
	





















	@Override
	public List<QuestionDomain> Questionfunc() {
		
		List<QuestionDomain> allQestions = questionrepository.findAll();
		// TODO Auto-generated method stub
		return allQestions;
	}


	@Override
	public List<QuestionDomain> StaticAnswer() {
		// TODO Auto-generated method stub
		return null;
	}




	
	@Override
	public String SaveAssignment(AssignmentsDomain addAssignment) {
		
/*if(addAssignment.getAssignmentName() ==null || addAssignment.getAssignmentid() ==null ) {
			
			throw new NotSavedException("Assignement id and Name mandatory"+addAssignment.getAssignmentid());
		}
		else {
		// TODO Auto-generated method stub
			
			teacherrepository.save(addAssignment);
			
			return "Data saved";
		}*/
		return "Data saved";
	}


	@Override
	public String SaveQuesction(QuestionDomain addQuecstion) {
		
/*if(addQuecstion.getQuestionid() ==null || addQuecstion.getAssignmentid() ==null|| addQuecstion.getQuestionno()==null|| addQuecstion.getAnswer() ==null ) {
			
			throw new NotSavedException("Assignement id and Name mandatory"+addQuecstion.getQuestionid());
		}
		else {
		// TODO Auto-generated method stub
			
			questionrepository.save(addQuecstion);
			
			return "Data saved";
		}*/
		return "Datasaved";
		// TODO Auto-generated method stub
		
	}


	@Override
	public String StudentGrade(Integer studentid, Integer assignmentid) {
	
		//Object emf;
		//EntityManager em= em.createEntityManager();
		
		//List<Object[]> results = 
	
		return null;
	}


	


	
}
