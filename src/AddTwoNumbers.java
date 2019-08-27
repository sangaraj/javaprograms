import java.util.Scanner;

public class AddTwoNumbers {
  int total;
  int n1, n2;

  public static void main(String[] args) {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    addTwoNumbers.readInput();
    addTwoNumbers.add();
  }

  private void add() {
    System.out.println("Addition of two nos are "+ (n1 + n2));
  }

  private void readInput() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter First Number");
    n1 = scanner.nextInt();

    System.out.println("Enter First Number");
    n2 = scanner.nextInt();
  }
}
