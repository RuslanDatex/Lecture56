package com.example.springmvc.service;

import com.example.springmvc.Dao.GroupsDaoImpl;
import com.example.springmvc.model.StudentGroup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GroupsServiceImpl implements GroupsService {

    private GroupsDaoImpl studentGroupsDao;

    @Autowired
    public GroupsServiceImpl() {
        studentGroupsDao = new GroupsDaoImpl();
    }

    @Override
    public void saveStudentGroup(StudentGroup group) {
        studentGroupsDao.save(group);
    }

    @Override
    public List<StudentGroup> getAllStudentGroups() {
        return studentGroupsDao.getAll();
    }

    @Override
    public StudentGroup getStudentGroup(long id) {
        return studentGroupsDao.get(id);
    }

    @Override
    public boolean updateStudentGroup(StudentGroup group) {
        return studentGroupsDao.update(group);
    }

    @Override
    public boolean deleteStudentGroup(long id) {
        return studentGroupsDao.delete(id);
    }
}
