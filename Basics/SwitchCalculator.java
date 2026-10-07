import  java.util.*;
public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double num1 = scanner.nextDouble();
      System.out.println("You entered first number : " + num1);
      System.out.println("Enter the operator : ");
     char operator = scanner.next().charAt(0);
     System.out.println("You entered operator +,-,/,* : " + operator);
      double num2 = scanner.nextDouble();
      System.out.println("You entered second number : " + num2);
      double result;
      switch(operator){
        case '+':
          result = num1 + num2;
          System.out.println(num1 + " + " + num2 + " = " + result);
          break;
        case '-':
          result = num1 - num2; 
          System.out.println(num1 + " - " + num2 + " = " + result);

          break;
        case '*':   
      result = num1 * num2;
          System.out.println(num1 + " * " + num2 + " = " + result);

          break;

        case '/':
          result = num1 / num2;
          System.out.println(num1 + " / " + num2 + " = " + result);

          break;

        default:
          System.out.println("Invalid operator!");

      }
      scanner.close();

    }
}
