import java.util.Arrays;

public class Reverse {
   public static void main(String[] args) {
      int[] sample = new int[] {1, 2, 3, 4, 5, 6};
      System.out.println(Arrays.toString(reverseList(sample)));
   }

   public static int[] reverseList(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
         int curr = arr[i];
	      arr[i] = arr[arr.length - (1 + i)];
         arr[arr.length - (1 + i)] = curr;
      }
      return arr;
	}


}
