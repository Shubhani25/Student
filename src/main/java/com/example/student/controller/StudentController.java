package com.example.student.controller;

import com.example.student.entity.Student;
import com.example.student.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student_api/v1")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //Fetch details of a student by id
    @GetMapping("/fetch_student_by_id/student_id/{id}")
    public Student fetchStudentById(@PathVariable("id") Integer id) {
        return studentService.fetchStudentById(id);
    }
    //fetch student details by student roll no
    @GetMapping("/fetch_student_by_rollno/rollno/{rollno}")
    public Student fetchStudentByRollno(@PathVariable("rollno") Integer rollno) {
        return studentService.fetchStudentByRollno(rollno);
    }

    @GetMapping("/fetch_all_students")
    public List<Student> fetchAllStudents() {
        return studentService.fetchAllStudents();
    }
    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @DeleteMapping("/delete_student/rollno/{rollno}")
    public void deleteStudent(@PathVariable("rollno") Integer rollno) {
        studentService.deleteStudent(rollno);
    }



}
