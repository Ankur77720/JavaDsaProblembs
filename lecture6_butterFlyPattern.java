import java.util.Scanner;

public class lecture6_butterFlyPattern {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 0; i < num; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print("* ");
      }
      for (int j = 0; j < (num - i - 1) * 2; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j <= i; j++) {
        System.out.print(" *");
      }
      System.out.println("");
    }
    for (int i = num - 1; i >= 0; i--) {
      for (int j = i; j >= 0; j--) {
        System.out.print("* ");
      }
      for (int j = (num - i - 1) * 2; j > 0; j--) {
        System.out.print("  ");
      }
      for (int j = i; j >= 0; j--) {
        System.out.print(" *");
      }
      System.out.println("");
    }
  }
}
