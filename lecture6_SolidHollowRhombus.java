import java.util.Scanner;

public class lecture6_SolidHollowRhombus {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i < num + 1; i++) {
      for (int j = 0; j < num - i; j++) {
        System.out.print("   ");
      }
      for (int j = 0; j < num; j++) {
        if (i == 1 || i == num) {
          System.out.print("  *");
        } else {
          if (j == 0 || j == num - 1) System.out.print("  *"); else {
            System.out.print("   ");
          }
        }
      }
      System.out.println();
    }
  }
}
