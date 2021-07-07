package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;

public interface TeacherServiceRepo {


	String SaveAssignment(AssignmentsDomain addAssignment);

	List<AssignmentsDomain> AllAssignments();

	List<QuestionDomain> Questionfunc();

	String SaveQuesction(QuestionDomain addQuecstion);

	String StudentGrade(Integer studentid, Integer assignmentid);

	List<QuestionDomain> StaticAnswer();


}
