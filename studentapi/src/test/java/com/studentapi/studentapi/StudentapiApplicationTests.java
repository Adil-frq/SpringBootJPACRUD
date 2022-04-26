package com.studentapi.studentapi;

import com.studentapi.studentapi.dal.entities.Student;
import com.studentapi.studentapi.repos.StudentRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentapiApplicationTests {

    @Autowired
    StudentRepository studentRepository;
    @Test
    public void studentTest() {
        Student student = new Student();
        student.setName("Arman");
        student.setFee(100d);
        student.setCourse("Spring Boot");

        studentRepository.save(student);
    }

}
