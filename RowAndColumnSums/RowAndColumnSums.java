import java.util.Arrays;
public class RowAndColumnSums {
   public static void main(String[] args) {
      sumRowsAndColumns(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
   }

   private static void sumRowsAndColumns(int[][] nums) {
      int[] rowSums = new int[nums.length];
      int[] colSums = new int[nums[0].length];
      for (int i = 0; i < nums.length; i++) {
         for (int j = 0; j < nums[i].length; j++) {
            rowSums[i] += nums[i][j];
            colSums[j] += nums[i][j];
         }
      }
      System.out.println("Row sums: " + Arrays.toString(rowSums));
      System.out.println("Column sums: " + Arrays.toString(colSums));
   }

}
