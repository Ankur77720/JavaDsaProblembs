import java.util.Scanner;

public class simpleInterest {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Principle Amount :");
    float principle = sc.nextFloat();
    System.out.print("Enter Rate of Interest : ");
    float rate = sc.nextFloat();
    System.out.print("Enter Time : ");
    float time = sc.nextFloat();
    float simpleInterest = (principle * rate * time) / 100;
    System.out.println(
      "Simple Interest from the given value is : " + simpleInterest
    );
  }
}
