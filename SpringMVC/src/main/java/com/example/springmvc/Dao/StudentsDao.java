package com.example.springmvc.Dao;

import com.example.springmvc.model.Student;

import java.util.List;

public interface StudentsDao {

    void save(Student student);

    List<Student> getAll();

    List<Student> getAllByGroupId(long groupId);

    Student get(long id);

    boolean update(Student student);

    boolean delete(long id);
}