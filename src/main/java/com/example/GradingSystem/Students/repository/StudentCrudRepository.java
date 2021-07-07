package com.example.GradingSystem.Students.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.GradingSystem.Students.domian.StudentAnswerDomian;

public interface StudentCrudRepository extends CrudRepository<StudentAnswerDomian, Integer> {

}
