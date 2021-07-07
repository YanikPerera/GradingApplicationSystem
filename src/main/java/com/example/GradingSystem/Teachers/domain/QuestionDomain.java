package com.example.GradingSystem.Teachers.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "question")
@Table (name = "question")
public class QuestionDomain {


	@Id
	@Column(name = "question_id")
	private Integer questionid;
	
	@Column(name = "question_no")
	private Integer questionno;
	
	@Column(name = "question")
	private String question;
	
	@Column(name = "answer")
	private Integer answer;
	
	@OneToMany(targetEntity = StudentAnswerDomian.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="questionid_pk",referencedColumnName = "question_id")
	private List<StudentAnswerDomian> studentanswerdomain;
	
	/*@Column(name = "assignment_id")
	private Integer assignmentid;*/
	
	//@OneToOne(targetEntity = StudentAnswerDomian.class,cascade = CascadeType.ALL)
	//@JoinColumn(name ="qa_fk",referencedColumnName = "aassignmentid");

	
	
}
