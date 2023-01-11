import java.util.Scanner;

public class lecture7_functionForAddingTwoNumbers {

  public static void add(int num1, int num2) {
    System.out.println(num1 + num2);
    return;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    add(num1, num2);
  }
}
