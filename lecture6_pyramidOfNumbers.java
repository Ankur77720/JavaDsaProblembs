import java.util.Scanner;

public class lecture6_pyramidOfNumbers {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for (int i = 1; i < num + 1; i++) {
      for (int j = 0; j < num - i; j++) {
        System.out.print("  ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print(" " + i + "  ");
      }
      System.out.println();
    }
    sc.close();
  }
}
