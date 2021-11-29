package com.example.springmvc.Dao;

import com.example.springmvc.model.StudentGroup;

import java.util.List;

public interface GroupsDao {

    void save(StudentGroup group);

    List<StudentGroup> getAll();

    StudentGroup get(long id);

    boolean update(StudentGroup group);

    boolean delete(long id);
}