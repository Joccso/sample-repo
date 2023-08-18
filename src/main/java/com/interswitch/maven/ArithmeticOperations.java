package com.interswitch.maven;

import java.util.Scanner;

public class ArithmeticOperations {
  /* Add function */
  public static double add(double num1, double num2) {
    return num1 + num2;
  }
  /* Subtraction function */
  public static double sub(double num1, double num2) {
    return num1 - num2;
  }
  /* Multiply function */
  public static double multiply(double num1, double num2) {
    return num1 * num2;
  }
  /* Division function */
  public static double div(double num1, double num2) {
    return num1 / num2;
  }

  public static void userOperation() {
    System.out.println("What operation do you want to perform?");
    Scanner scanInput = new Scanner(System.in);
    System.out.println("Enter:\n1 For Addition.\n2. For Subtraction\n3. For Multiplication\n4. For Division");
    System.out.print("Enter your choice: ");
    int choice = scanInput.nextInt();
    if (choice >= 1 && choice <= 4) {
      System.out.print("Enter the first number: ");
      double num1 = scanInput.nextDouble();
      System.out.print("Enter the second number: ");
      double num2 = scanInput.nextDouble();
      switch (choice) {
        case 1:
          System.out.println("The value of " + num1 + " + " + num2 + " = " + add(num1, num2));
          break;
        case 2:
          System.out.println("The value of " + num1 + " - " + num2 + " = " + sub(num1, num2));
          break;
        case 3:
          System.out.println("The value of " + num1 + " x " + num2 + " = " + multiply(num1, num2));
          break;
        case 4:
          System.out.println("The value of " + num1 + " / " + num2 + " = " + div(num1, num2));
          break;
        default:
          break;
      }
    }
    else {
      System.out.println("Invalid input. Enter an integer value from 1 to 4.");
    }
  }
}
