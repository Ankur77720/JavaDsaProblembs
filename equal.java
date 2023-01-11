import java.util.Scanner;

public class equal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int val1 = sc.nextInt();
    int val2 = sc.nextInt();
    int val3 = sc.nextInt();
    if ((val1 == val3) && (val3 == val2)) {
      System.out.println("All values are equal");
    } else {
      if ((val1 == val3) || (val3 == val2) || (val1 == val2)) {
        System.out.println("Two values are equal");
      } else {
        System.out.println("No values are equal");
      }
    }
    sc.close();
  }
}
