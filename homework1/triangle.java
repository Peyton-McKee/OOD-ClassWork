import java.util.Arrays;

public class triangle {
   public static void main(String[] args) {
		int height = 0;
		try {
			height = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {
			System.err.println("Must Pass In An Integer As Argument");
			System.exit(1);
		}
		if (height < 3) {
			System.err.println("Height must be greater than or equal to ");
			System.exit(1);
		}
		printTriangles(height);
	}

	public static void printTriangles(int size) {
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
