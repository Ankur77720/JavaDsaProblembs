import java.util.Scanner;

public class voting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your Name : ");
    String name = sc.next();
    System.out.print("Enter your age : ");
    int age = sc.nextInt();
    System.out.println(
      "Hello " +
      name +
      "," +
      ((age >= 18) ? "You are a valid voter" : "You can't cast the vote")
    );
    if (age < 18) {
      System.out.println("You can cast vote after " + (18 - age) + " Years");
    }
    sc.close();
  }
}
