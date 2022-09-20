package com.tlglearning.animals;

public class Dog extends Wolf {

  public static final int MY_CONSTANT = initializeValue();

  static {
    System.out.println("Dog static initialization block");
  }

  private int data = initializeData();

  {
    System.out.println("Dog instance initialization block");
  }

  {
    System.out.println("Second Dog initialization block");
  }

  public Dog() {
    System.out.println("Dog constructor");
  }

  private static int initializeValue() {
    System.out.println("Dog.initializeValue");
    return -2;
  }

  public static void whoAmI() {
    System.out.println("I'm a dog");
  }

  private int initializeData() {
    System.out.println("Dog.initializeData");
    return 2;
  }

  @Override
  public void vocalize() {
    System.out.println("Bark like a dog!");
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for balls, bones, leaves, etc.");
  }

  public void rollOver() {
    System.out.println("I'm rolling over! I'm the best dog!");
  }
}
