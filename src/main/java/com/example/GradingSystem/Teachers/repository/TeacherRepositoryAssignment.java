package com.example.GradingSystem.Teachers.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.GradingSystem.Teachers.domain.AssignmentsDomain;

public interface TeacherRepositoryAssignment extends JpaRepository<AssignmentsDomain, Integer> {
	
	

}
