package com.example.GradingSystem.Teachers.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Entity(name = "assignment")
@Table (name = "assignment")
public class AssignmentsDomain {
	
	@Id
	@Column(name = "assignment_id")
	private Integer assignmentid;
	
	@Column(name = "assignment_name")
	private String assignmentName;

	
	@OneToMany(targetEntity = QuestionDomain.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="assignmenqtid_fk",referencedColumnName = "assignment_id")
	private List<QuestionDomain> questiondomain;
	
	@OneToMany(targetEntity = StudentAnswerDomian.class,cascade = CascadeType.ALL)
	@JoinColumn(name ="assignmenqtidstanswer_fk",referencedColumnName = "assignment_id")
	private List<StudentAnswerDomian> studentanswerdomain;
	
	
	

}
