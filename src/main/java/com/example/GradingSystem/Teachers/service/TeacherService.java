package com.example.GradingSystem.Teachers.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.repository.QuestionRepository;
import com.example.GradingSystem.Teachers.repository.TeacherRepository;
import com.example.GradingSystem.Teachers.repository.TeacherServiceRepo;

import ExceptionHandling.NotSavedException;

@Service
public class TeacherService implements TeacherServiceRepo {
	
	@Autowired
	private TeacherRepository teacherrepository;
	@Autowired
	private QuestionRepository questionrepository;

	
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
	public List<AssignmentsDomain> AllAssignments() {
		
// here we can get users as a list by using List<TeacherDomain>
	List<AssignmentsDomain> allassignment = teacherrepository.findAll();
	
	return allassignment;
	
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
