package com.tlglearning.animals;

public class Main {

  public static void main(String[] args) {
    new Dog();
    /*
    0. Class initialization of Wold superclass(Object) - not necessary, because Object is already loaded and initialized - invisible
    1. Class initialization of Wolf
    2. Class initialization of Dog  - step 0-2 happened before new Dog()
    (2a). Object's initialization of Dog instance. - invisible
    3. Wolf's initialization of Dog instance
    4. Dog's initialization of Dog instance - Dog constructor invoke super() first, then go check instance initialization from top to bottom before printout in Dog Class
     */
  }

}
