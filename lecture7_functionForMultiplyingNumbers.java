import java.util.Scanner;

public class lecture7_functionForMultiplyingNumbers {

  public static int multiplyNumbers(int num1, int num2) {
    int product;
    product = num1 * num2;
    return product;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();
    System.out.println(multiplyNumbers(num1, num2));
    sc.close();
    return;
  }
}
