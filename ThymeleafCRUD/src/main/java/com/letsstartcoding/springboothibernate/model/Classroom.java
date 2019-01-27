package com.letsstartcoding.springboothibernate.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
//ctrl+shift+O - shortcut for dependencies import

@Entity
@Table(name="classroom")
@SequenceGenerator(name = "id_classroom_seq", sequenceName = "public.id_classroom_seq", allocationSize=1)
@EntityListeners(AuditingEntityListener.class)

public class Classroom {

    public Classroom (){

    }

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY, generator="id_classroom_seq")
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "classroom", targetEntity = Student.class, fetch = FetchType.LAZY)
    private List<Student> students;

    @Size(min=3,max=30)
    private String class_name;

    public Serializable getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }



}
