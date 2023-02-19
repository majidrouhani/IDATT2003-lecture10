package edu.ntnu.idatt2001.mvc.student.controller;

import edu.ntnu.idatt2001.mvc.student.model.Student;
import edu.ntnu.idatt2001.mvc.student.model.StudentModel;
import edu.ntnu.idatt2001.mvc.student.view.StudentView;

public class StudentController {
  private StudentView studentView;
  private StudentModel studentModel;

  public StudentModel getStudentModel() {
    return studentModel;
  }

  public void setStudentModel(StudentModel studentModel) {
    this.studentModel = studentModel;
  }

  public StudentView getStudentView() {
    return studentView;
  }

  public void setStudentView(StudentView studentView) {
    this.studentView = studentView;
  }

  public void updateModel(Student studentModel) {
    System.out.println(studentModel.toString());
  }

  public void updateView() {
    studentView.printStudentDetails(studentModel);
  }
}