import java.util.Scanner;

public class robertMarks {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float math;
    float computer;
    float english;
    System.out.println("Enter marks in Math subject : ");
    math = sc.nextFloat();
    while (math > 100 || math < 0) {
      System.out.println("Marks not valid, Re-Enter the marks ");
      math = sc.nextFloat();
    }
    System.out.println("Enter marks in Computer subject : ");
    computer = sc.nextFloat();
    while (computer > 100 || computer < 0) {
      System.out.println("Marks not valid, Re-Enter the marks ");
      computer = sc.nextFloat();
    }
    System.out.println("Enter marks in English subject : ");
    english = sc.nextFloat();
    while (english > 100 || english < 0) {
      System.out.println("Marks not valid, Re-Enter the marks ");
      english = sc.nextFloat();
    }

    System.out.println(
      "Total marks of student is " + (math + english + computer)
    );
    System.out.println(
      "Total percentage student obtain : " +
      ((math + english + computer) * 100 / 300)
    );
    sc.close();
  }
}
