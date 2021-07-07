package com.example.GradingSystem.Students.domian;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.sun.istack.NotNull;
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
@Entity(name = "student")
@Table (name = "student")
public class StudentDomain {

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		@NotNull
		@Column(name = "student_id")
		private Integer studentid;
		@NotNull
		@Column(name = "student_name")
		private String studentName;
		
		
		@OneToMany(targetEntity = StudentAnswerDomian.class,cascade = CascadeType.ALL)
		@JoinColumn(name ="studentid_pk",referencedColumnName = "student_id")
		private List<StudentAnswerDomian> studentanswerdomain;
//getter and setter we are basically use for access the data,bcz in java we don't direct call the programmer values
		
		
		
	}

	

