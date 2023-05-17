import java.util.Arrays;

public class UniqueStrings {
   public static void main (String[] args) {
      String[] strs = {"hello", "world", "hello", "goodbye", "world"};
      System.out.println(Arrays.toString(uniqueStrings(strs)));
   }

   public static String[] uniqueStrings(String[] strs) {
		String[] uniqueStrsWithNull = new String[strs.length];
		for (int i = 0; i < strs.length; i++) {
			if (!Arrays.asList(uniqueStrsWithNull).contains(strs[i])) {
				uniqueStrsWithNull[i] = strs[i];
			}
		}
		return Arrays.stream(uniqueStrsWithNull).filter((str) -> str != null).toArray(String[]::new);
	}

}