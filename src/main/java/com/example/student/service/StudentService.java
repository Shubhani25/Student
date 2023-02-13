package com.example.student.service;

import com.example.student.entity.Student;
import com.example.student.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student fetchStudentById(Integer id) {
        return studentRepository.getById(id);
    }

    public Student fetchStudentByRollno(Integer rollno) {
        return studentRepository.getById(rollno);
    }


    public Student saveStudent(Student student) {
        Student savedStudent = null;
        Student existingStudent = studentRepository.getById(Integer.valueOf(student.getId()));
        if(null == existingStudent){
            savedStudent = studentRepository.save(student);
        }
        return savedStudent;

    }

    public void deleteStudent(Integer rollno) {
        Student existingStudent = studentRepository.getById(rollno);
        if(null != existingStudent){
            studentRepository.delete(existingStudent);
        }
    }

    public List<Student> fetchAllStudents() {
        return studentRepository.findAll();
    }
}
