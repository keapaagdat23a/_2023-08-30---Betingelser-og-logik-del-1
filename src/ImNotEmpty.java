import java.util.Scanner;

public class ImNotEmpty {
  public static void main(String[] args) {
    int age;
    Scanner in = new Scanner(System.in);
    System.out.print("What is your age? ");
    age = in.nextInt();
    in.nextLine(); // Scanner bug

    if (age < 18) {
      System.out.print("You're too young.");
    } else {
      System.out.print("Welcome to Monkey Bar!");
    }

    System.out.print("\n\nWhat is your name? ");
    String name = in.nextLine();

    if (name.equals("") || age > 18) {
      System.out.print("Hey you!");
    } else {
      System.out.print("Hey, " + name);
    }

    // Exclusive OR, kaldet XOR
    if (age < 10 ^ age >= 18) {

    }
  }
}
