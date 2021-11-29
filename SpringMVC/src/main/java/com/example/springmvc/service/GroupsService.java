package com.example.springmvc.service;

import com.example.springmvc.model.StudentGroup;

import java.util.List;

public interface GroupsService {


    void saveStudentGroup(StudentGroup group);

    List<StudentGroup> getAllStudentGroups();

    StudentGroup getStudentGroup(long id);

    boolean updateStudentGroup(StudentGroup group);

    boolean deleteStudentGroup(long id);
}