package L23StringBuilder;

public class StringBuilder2 {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.append(", ").append("world");
    System.out.println(sb);

    System.out.printf("Test %s \n", "eqw");
    System.out.printf("Test %10d \n", 2222);
    System.out.printf("Test %-10d \n", 2);
    System.out.printf("Test %10.2f \n", 2.54444);
  }
}
