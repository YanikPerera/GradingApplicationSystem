package com.example.GradingSystem.Teachers.repository;

import java.util.List;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;
import com.example.GradingSystem.Teachers.domain.QuestionDomain;
import com.example.GradingSystem.Teachers.domain.TeacherDomain;

public interface TeacherServiceRepo {


	String SaveAssignment(AssignmentsDomain addAssignment);

	List<QuestionDomain> Questionfunc();

	String SaveQuesction(QuestionDomain addQuecstion);

	String StudentGrade(Integer studentid, Integer assignmentid);

	List<QuestionDomain> StaticAnswer();

	String GetStaticOnAnswer(Integer studentid_pk, Integer assignmenqtidstanswer_fk);

	String GetGradeOnAssignment(Integer studentid_pk, Integer assignmenqtidstanswer_fk);


}
