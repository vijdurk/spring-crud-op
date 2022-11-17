package com.crud.repository;

import org.springframework.data.repository.CrudRepository;

import com.crud.model.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}