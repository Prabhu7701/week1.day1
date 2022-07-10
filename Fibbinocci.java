package assignmentWeek1Day1;

public class Fibbinocci {

	public static void main(String[] args) {

		int i = 0, j = 1;
		
		System.out.println(i);
		System.out.println(j);
		
		for (int A = 0; A < 9; A++) {

			int x = i + j;
			System.out.println(x);
			i = j;
			j = x;

		}

	}
}
