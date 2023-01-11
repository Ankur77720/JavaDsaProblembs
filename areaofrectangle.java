import java.util.Scanner;

public class areaofrectangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float length = sc.nextFloat();
    float width = sc.nextFloat();
    System.out.println(
      "Area of Rctangle is : " +
      (length * width) +
      "\n" +
      "Perimeter of Rectangle is : " +
      (2 * (length + width))
    );
    sc.close();
  }
}
