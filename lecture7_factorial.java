import java.util.Scanner;

public class lecture7_factorial {

  public static int factorial(int num) {
    if (num <= 0) {
      return 1;
    } else {
      return num * factorial(--num);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    System.out.println(factorial(num));
    sc.close();
  }
}
