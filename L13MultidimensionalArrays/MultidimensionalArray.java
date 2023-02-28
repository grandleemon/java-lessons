package L13MultidimensionalArrays;

public class MultidimensionalArray {
  public static void main(String[] args) {
    int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    System.out.println(array[2][2]);

    String[][] strings = new String[2][3];

    for(int[] row : array) {
      for(int col : row) {
        System.out.print(col + " ");
      }
      System.out.println();
    }
  }
}
