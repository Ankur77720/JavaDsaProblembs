import java.util.Scanner;

public class fahreniteIntoCelcius {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter temperature : ");
    float fahrenite = sc.nextFloat();
    System.out.println(
      " " +
      fahrenite +
      " Fahrenite is equal to " +
      ((fahrenite - 32) * 5 / 9) +
      " Celcius"
    );
    sc.close();
  }
}
