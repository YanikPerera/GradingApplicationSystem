package com.example.GradingSystem.Students.repository;


import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.GradingSystem.Students.domian.StudentAnswerDomian;



public interface StudentRepository extends JpaRepository<StudentAnswerDomian,Integer>{
	
//	@Query("SELECT a from student_answer a where a.studentid_pk=?1 and a.assignmenqtidstanswer_fk=?2 and a.questionid_pk=?3")
	//@Query("SELECT a.answer ,q.answer FROM student_answer a JOIN ")
	//@Query("select c.itemsOrdered as itemsOrdered, d.itemsDelivered as itemsDelivered from A a join B b on b.a_id = a.id join C c on c.b_id = b.id join D d on d.b_id = b.id where a.id = ?1")
    //@Query("SELECT a.answer FROM student_answer a where a.answerid=?1 and a.answer=?2 and a.rightwrong=?3")
	//@Query("SELECT a.answer FROM student_answer a JOIN a.question q and JOIN a.assignment g and JOIN a.student s where s.studentid=?1 and g.assignmentid=?2 and q.questionno=?3 ")
	
	
	@Query(value = "SELECT student_answer.* ,question.answer FROM `student_answer` JOIN `question` ON student_answer.studentid_pk=?1 AND student_answer.assignmenqtidstanswer_fk=?2 AND student_answer.questionid_pk=?3 AND student_answer.questionid_pk=question.question_no AND student_answer.assignmenqtidstanswer_fk=question.assignmenqtid_fk", 
	nativeQuery = true)
    public List<StudentAnswerDomian> findByAnsweridAndAnswerAndRightwrong(Integer studentid_pk,Integer assignmenqtidstanswer_fk,Integer questionid_pk);
	
	
	@Query(value = "SELECT student_answer.* FROM `student_answer` JOIN `question` ON student_answer.studentid_pk=?1 AND student_answer.assignmenqtidstanswer_fk=?2 AND student_answer.questionid_pk=?3 AND student_answer.questionid_pk=question.question_no AND student_answer.assignmenqtidstanswer_fk=question.assignmenqtid_fk", 
	nativeQuery = true)
	public StudentAnswerDomian findByAndAnswerAndRightwrong(Integer studentid_pk,Integer assignmenqtidstanswer_fk,Integer questionid_pk);


	
	//public List<StudentAnswerDomian> findByStudentidAndAssignmentidAndQuestionid(Integer studentid_pk,Integer assignmenqtidstanswer_fk,Integer questionid_pk);
	
	//@Query("SELECT new com.example.GradingSystem.dto.Reviewanswer(s.studentanswer , q.questionanswer) FROM StudentAnswerDomian s JOIN s.QuestionDomain q")
	//List<StudentAnswerDomian> findByStudentidAndAssignmentidAndQuestionid(Integer studentid,Integer assignmentid,Integer questionid);
	
	//@Query("SELECT * FROM student_answer WHERE student_id = studentid AND assignment_id = assignmentid AND question_id = questionid")
	//Optional <StudentAnswerDomian> FindByResult(int studentid, int assignmentid, int questionid);

	//@Query("SELECT student_answer.answer FROM student_answer JOIN question ON student_answer.student_id = 1 AND student_answer.assignment_id = question.assignment_id AND student_answer.answer = question.answer AND student_answer.question_id = question.question_no");
    //List<StudentAnswerDomian> findByStudentidAndAssignmentidAndQuestionid()


}

