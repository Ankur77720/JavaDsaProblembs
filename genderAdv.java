import java.util.Scanner;

public class genderAdv {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char gender = sc.next().charAt(0);
    if (gender == 'm' || gender == 'M') {
      System.out.println("Good morning sir");
    } else {
      if (gender == 'f' || gender == 'F') {
        System.out.println("Good morning Ma'am");
      } else {
        System.out.println("Invalid Input");
      }
    }
    sc.close();
  }
}
