import java.util.Random;

public class WhileDemo {
  public static void main(String[] args) {
    Random random = new Random();
    int number = 0;

    // What NOT do to:
    number = random.nextInt(21) - 10;
    if (number == 0) {
      number = random.nextInt(21) - 10;
      if (number == 0) {
        number = random.nextInt(21) - 10;
      }
    }

    // What TO do:
    while (number == 0) {
      number = random.nextInt(21) - 10;
    }
  }
}
