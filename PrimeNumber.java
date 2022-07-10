package assignmentWeek1Day1;

public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		boolean isPrime= false;
		for (int j=2;j<=i/2;j++) {
			if(i%j==0) {
				isPrime = true;
				break;
			}
		}
		if (!isPrime) {
			System.out.println(i+" is prime number");
		}else {
			System.out.println(i+" is not prime number");
		}
		

	}

}