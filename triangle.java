import java.util.Arrays;

public class triangle {
   public static void main(String[] args) {
      int size = Integer.parseInt(args[0]);
      char[][] characters = new char[size * 2 + 1][size + 1];

	   for (int i = 0; i <= size; i++) {
		   Arrays.fill(characters[i], ' ');
         Arrays.fill(characters[i + size], ' ');
		   if (i < size) {
			   characters[i][0] = '*';
			   characters[(i + size)][size] = '*';

			   characters[i][i % size] = '*';
			   characters[(i + size)][i % size] = '*';
         }
		   else {
			   Arrays.fill(characters[i], '*');
            characters[i + size][size] = '*';
		   }
	   }

      for (char[] chars: characters) {
		   System.out.println(chars);
	   }
   }
}
