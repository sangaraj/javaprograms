import java.util.Scanner;

public class EvenOrOdd {

  int n;
  int max;

  public static void main(String[] args)
  {
    EvenOrOdd evenOrOdd = new EvenOrOdd();
    evenOrOdd.evenOrOdd();
    evenOrOdd.printSeriesOfEvenOddNumbers();

  }

  private void evenOrOdd()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter you input");
    n = scanner.nextInt();

    if (n%2 == 0)
    {
      System.out.println(n + " is an even number");
    }
    else
    {
      System.out.println(n + " is an odd number");
    }


  }

  private void printSeriesOfEvenOddNumbers()
  {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the Max number");
    max = scanner.nextInt();

    for(int i =1; i<=max; i++)
    {
      if(i%2==0)
      {
        System.out.println(i+ " is an even no");
      }
      else
      {
        System.out.println(i+ " is an odd no");
      }

    }
  }
}
