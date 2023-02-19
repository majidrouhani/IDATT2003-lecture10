package edu.ntnu.idatt2001.mvc.student.view;

import edu.ntnu.idatt2001.mvc.student.model.Student;
import edu.ntnu.idatt2001.mvc.student.model.StudentModel;

public class StudentView {
  public void printStudentDetails(StudentModel studentModel) {

    for (Student student : studentModel.getStudents()) {
      System.out.println("Student: ");
      System.out.println("Name: " + student.getFullname());
      System.out.println("Age: " + student.getAge());
    }
  }
}