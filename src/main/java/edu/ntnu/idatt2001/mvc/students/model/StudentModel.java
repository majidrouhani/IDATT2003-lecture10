package edu.ntnu.idatt2001.mvc.students.model;

import java.util.List;

import edu.ntnu.idatt2001.lectures.example1.composition.AppData;
import edu.ntnu.idatt2001.lectures.example1.composition.Student;

public class StudentModel {

    private List<Student> students;

    public StudentModel() {
        this.students = AppData.getData();
    }

    public void addStudent(Student student) {
        if (student != null) {
            this.students.add(student);
        }

    }

    public List<Student> getStudents() {
        return students;
    }

}
