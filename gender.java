import java.util.Scanner;

public class gender {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char gender = sc.next().charAt(0);
    System.out.println(
      "Good morning " +
      (
        ((gender == 'm') || (gender == 'M'))
          ? "Sir"
          : ((gender == 'F') || (gender == 'f')) ? "Ma'am" : ""
      )
    );
    sc.close();
  }
}
