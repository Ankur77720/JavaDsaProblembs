import java.util.Scanner;

public class main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float Num1 = sc.nextFloat();
    float Num2 = sc.nextFloat();
    System.out.println(
      "The sum of " + Num1 + " and " + Num2 + " is " + (Num1 + Num2)
    );
    sc.close();
  }
}
