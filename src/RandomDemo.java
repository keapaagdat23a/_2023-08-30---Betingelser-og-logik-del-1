import java.util.Random;

public class RandomDemo {
  public static void main(String[] args) {
    Random random = new Random();

    System.out.print(random.nextInt(6) + 1);

    // Tilf. tal mellem -10 og +10
    int number = random.nextInt(21) - 10;
    if (number == 0)
      number = 1;
    System.out.println(number);

  }
}
