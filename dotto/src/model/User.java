package model;
public class User {
  public String name;

  public User(String name) {
    this.name = name;
  }

  public void sayHi() {
    System.out.println("hi! " + this.name);
  }
}