package com.letsstartcoding.springboothibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.letsstartcoding.springboothibernate.model.Classroom;

public interface ClassroomRepository extends JpaRepository <Classroom, Integer> {

}
