import java.util.Arrays;
import java.util.HashMap;

public class Zip {
   public static void main(String[] args) {
      int[] nums1 = new int[] {4, 6, 3, 6};
      int[] nums2 = new int[] {8, 1, 9, 10, 24, 56};
      System.out.println(Arrays.toString(zip(nums1, nums2)));
   }
   public static int[] zip(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length + nums2.length];
		HashMap<Integer, int[]> lengthToArray = new HashMap<Integer, int[]>();
		lengthToArray.put(nums1.length, nums1);
		lengthToArray.put(nums2.length, nums2);
      int[] longerArr = lengthToArray.get(Math.max(nums1.length, nums2.length));
      int[] shorterArr = lengthToArray.get(Math.min(nums1.length, nums2.length));
		int i = 0;
		while (i / 2 < shorterArr.length) {
			ans[i] = nums1[i / 2];
			ans[i + 1] = nums2[i/2];
			i += 2;
		}
		while (i - shorterArr.length < longerArr.length) {
			ans[i] = longerArr[i - shorterArr.length];
			i ++;
		}
		return ans;
	}

}
