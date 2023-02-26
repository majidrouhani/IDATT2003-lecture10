package edu.ntnu.idatt2001.mvc.students.view;

import java.time.LocalDate;
import java.time.Month;

import edu.ntnu.idatt2001.lectures.example1.composition.Student;
import edu.ntnu.idatt2001.mvc.students.controller.StudentController;
import edu.ntnu.idatt2001.mvc.students.model.StudentModel;

public class App {

  public static void main(String[] args) {

    StudentController controller = new StudentController();

    controller.setStudentView(new StudentView());

    controller.setStudentModel(new StudentModel());

    controller.updateView();

    Student s1 = new Student("Maria", "Henriksen",LocalDate.of(1994, Month.DECEMBER, 24),"F",4400,"Kristiansand", "Sorlandet");
    controller.updateModel(s1);

    controller.updateView();
  }
}