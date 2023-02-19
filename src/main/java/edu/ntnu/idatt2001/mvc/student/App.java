package edu.ntnu.idatt2001.mvc.student;

import edu.ntnu.idatt2001.mvc.student.controller.StudentController;
import edu.ntnu.idatt2001.mvc.student.model.StudentModel;
import edu.ntnu.idatt2001.mvc.student.view.StudentView;

public class App {

  public static void main(String[] args) {

    StudentController controller = new StudentController();

    controller.setStudentView(new StudentView());

    controller.setStudentModel(new StudentModel());

    controller.updateView();

  }
}