package com.example.springmvc.service;
import com.example.springmvc.Dao.StudentsDaoImpl;
import com.example.springmvc.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceI implements StudentService {

    private StudentsDaoImpl studentsDao;

    @Autowired
    public StudentServiceI() {
        studentsDao = new StudentsDaoImpl();
    }

    @Override
    public void saveStudent(Student student) {
        studentsDao.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentsDao.getAll();
    }

    @Override
    public List<Student> getAllStudentsByGroup(long groupId) {
        return studentsDao.getAllByGroupId(groupId);
    }

    @Override
    public Student getStudent(long id) {
        return studentsDao.get(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        if(studentsDao.update(student)){
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteStudent(long id) {
        return studentsDao.delete(id);
    }
}
