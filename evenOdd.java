import java.util.Scanner;

public class evenOdd {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Double number = sc.nextDouble();
    System.out.println("Number is " + (number % 2 == 0 ? "Even" : "Odd"));
    sc.close();
  }
}
