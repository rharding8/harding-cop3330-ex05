package base;

import java.util.Scanner;

public class SimpleMath {
  Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    SimpleMath maths = new SimpleMath();

    int x = maths.firstNum();
    int y = maths.secondNum();

    System.out.printf("%s%n%s%n%s%n%s%n", maths.sum(x,y), maths.diff(x,y), maths.product(x,y), maths.quotient(x,y));
  }

  public int firstNum(){
    System.out.print("Gimme a number, any number! ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Not a valid number!");
      return firstNum();
    }

    return Integer.parseInt(n);
  }

  public int secondNum(){
    System.out.print("Gimme another number! ");
    String n = input.next();
    try {
      Integer.parseInt(n);
    }
    catch (NumberFormatException e) {
      System.out.println("ERROR: Not a valid number!");
      return secondNum();
    }

    return Integer.parseInt(n);
  }

  public String sum(int a, int b){
    return String.format("%d + %d = %d", a, b, a + b);
  }

  public String diff(int a, int b){
    return String.format("%d - %d = %d", a, b, a - b);
  }

  public String product(int a, int b){
    return String.format("%d * %d = %d", a, b, a * b);
  }

  public String quotient(int a, int b){
    return String.format("%d / %d = %d", a, b, a / b);
  }
}
