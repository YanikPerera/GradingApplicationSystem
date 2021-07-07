package com.example.GradingSystem.Students.domian;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "student_answer")	
@Table (name = "student_answer")
public class StudentAnswerDomian {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "answer_id")
	private Integer answerid;
	
	@NotNull
	@Column(name = "answer")
	private Integer answer;
	@NotNull
	@Column(name = "rightwrong")
	private Boolean rightwrong;
	
	/*@NotNull
	@Column(name = "assignment_id")
	private Integer assignmentid;
	@NotNull
	@Column(name = "student_id")
	private Integer studentid;
	@NotNull
	@Column(name = "question_id")
	private Integer questionid;*/

	

}
