package L11Arrays;

public class Arrays {
  public static void main(String[] args) {
    int[] numbers = new int[5];
    for(int i = 0; i < numbers.length; i++) {
      numbers[i] = i;
    }
    for(int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
    int[] nr1 = {0, 1, 2};
    for(int i = 0; i < nr1.length; i++) {
      System.out.println(nr1[i]);
    }
  }
}
