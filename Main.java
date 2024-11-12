import java.util.Scanner;
public class solution{
  public static void main (strings[] args) {
    Scanner scanner = new Scanner(System.in);
    int X = scanner.nextInt();
    int Y = scanner.nextInt();
    int totalDays = 7;
    int clearDays = totalDays - (X + Y);
    System.out.println(clearDays);
    scanner.close();
  }
}
