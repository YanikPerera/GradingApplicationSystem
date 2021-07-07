package com.example.GradingSystem.Teachers.domain;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//as below the code we can create a entity with the database values
// first we should have mention the table name,, the table name is not in the database it will create automatically 
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "teacher")
@Table (name = "teacher")
public class TeacherDomain {
			
			@Id
			@GeneratedValue(strategy=GenerationType.AUTO)	
			@Column(name = "teacher_id")
			private Integer teacherid;
			
			@Column(name = "teacher_name")
			private String teachername;

			@OneToMany(targetEntity = AssignmentsDomain.class,cascade = CascadeType.ALL)
			@JoinColumn(name ="teacherid_fk",referencedColumnName = "teacher_id")
			private List<AssignmentsDomain> assignmentdomain;
			
			
			


		}

