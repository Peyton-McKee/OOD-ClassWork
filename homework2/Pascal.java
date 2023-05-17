import java.util.Arrays;

public class Pascal {
   public static void main(String[] args) {
      System.out.println(Arrays.deepToString(pascal(8)));
   }

   public static int[][] pascal(int n) {
		if (n < 2) {
			throw new IllegalArgumentException("Input must be greater than or equal to 2");
		}
		int[][] ans = new int[n][n];
		ans[0][0] = 1;
		ans[1][0] = 1;
		ans[1][1] = 1;
		for (int i = 2; i < n; i++) {
			ans[i][0] = 1;
			for (int j = 1; j < i; j++) {
				ans[i][j] = ans[i-1][j-1] + ans[i-1][j];	
			}
			ans[i][i] = 1;
		}
		return ans;
	}

}
