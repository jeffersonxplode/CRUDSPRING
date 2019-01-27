package com.letsstartcoding.springboothibernate.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.letsstartcoding.springboothibernate.model.Classroom;
import com.letsstartcoding.springboothibernate.repository.ClassroomRepository;

@Service
public class ClassroomDAO {

    @Autowired
    ClassroomRepository ClassroomRepository;

    public List<Classroom> findAll() {

        return ClassroomRepository.findAll();
    }

}
