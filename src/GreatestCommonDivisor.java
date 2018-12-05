import java.util.Scanner;

public class GreatestCommonDivisor {
  public static void main(String[] args) {
    int a, b;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a: ");
    a = input.nextInt();
    System.out.println("Enter b: ");
    b = input.nextInt();

    String result = findGreatestCommonDivisor(a, b);
    System.out.println(result);
  }

  public static String findGreatestCommonDivisor(int a, int b) {
    a = Math.abs(a);
    b = Math.abs(b);
    if (a == 0 || b == 0) return "No greatest common factor";
    while (a != b) {
      if (a > b)
        a = a - b;
      else
        b = b - a;
    }
     return "Greatest common factor: " + a;
  }
}
