import java.util.Scanner;

public class lecture6_palindromNumberPyramid {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i <= num + 1; i++) {
      for (int j = 0; j <= num - i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < (i) - 1; j++) {
        System.out.print("" + (i - j - 1) + " ");
      }
      for (int j = 1; j < (i) - 1; j++) {
        System.out.print("" + (j + 1) + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}
