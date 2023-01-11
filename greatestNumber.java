import java.util.Scanner;

public class greatestNumber {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first Number : ");
    double firstVal = sc.nextDouble();
    System.out.print("Enter Secont Number : ");
    double secondVal = sc.nextDouble();
    if (firstVal > secondVal) {
      System.out.println(firstVal + " is greater than " + secondVal);
    } else if (firstVal < secondVal) {
      System.out.println(secondVal + " is greater than " + firstVal);
    } else {
      System.out.println("Both Numbers are equal");
    }
  }
}
