package edu.ntnu.idatt2001.mvc.student.model.utils;

/**
 * 
 */

public class Name {
  private static final String WHITESPACE = " ";
  private final String firstname;
  private final String lastname;
  private final String fullname;

  public Name(String firstname, String lastname) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.fullname = firstname.concat(WHITESPACE).concat(lastname);
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getFullname() {
    return fullname;
  }

  @Override
  public String toString() {
    return "Name [firstname=" + firstname + ", lastname=" + lastname + ", fullname=" + fullname + "]";
  }
}