public class Demo047 {

  public static void main(String[] args) {

    int count = 0, num = 123;

    for (; num != 0; num /= 10, ++count) {
    }

    System.out.println("Number of digits: " + count);
  }
}