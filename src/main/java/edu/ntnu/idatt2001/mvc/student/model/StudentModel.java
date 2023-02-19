package edu.ntnu.idatt2001.mvc.student.model;

import java.util.List;

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
