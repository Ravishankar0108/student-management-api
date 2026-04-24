package com.ravi.studentapi;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // Welcome + Input loop page
    @GetMapping("/")
    public String home() {
        return """
        <h1>Welcome to Student Management by Ravi Shankar Shukla</h1>
        <button onclick="addStudents()">Add Students</button>
        <br><br>
        <a href="/students">View Students</a>

        <script>
            async function addStudents() {
                let count = prompt("How many students do you want to add?");

                for (let i = 1; i <= count; i++) {
                    let name = prompt("Enter name of student " + i);
                    let email = prompt("Enter email of student " + i);
                    let course = prompt("Enter course of student " + i);

                    await fetch('/students', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/json'
                        },
                        body: JSON.stringify({
                            name: name,
                            email: email,
                            course: course
                        })
                    });
                }

                alert("All students added successfully!");
                window.location.href = "/students";
            }
        </script>
        """;
    }

    // Get all students
    @GetMapping("/students")
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // Add student
    @PostMapping("/students")
    public Student createStudent(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    // Delete student
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable Long id) {
        studentRepository.deleteById(id);
    }
}
