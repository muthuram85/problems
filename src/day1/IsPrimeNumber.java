package day1;

public class IsPrimeNumber {

	public static boolean isPrime(int number) {
		for(int divisor = number / 2; divisor > 1; divisor-- ) {
			if(number % divisor == 0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println(isPrime(25) ? "Failed" : "Passed");
		System.out.println(isPrime(19) ? "Passed" : "Failed");
		System.out.println(isPrime(2147483647) ? "Passed" : "Failed");
		System.out.println(isPrime(3125) ? "Failed" : "Passed");
		System.out.println(isPrime(4874121) ? "Failed" : "Passed");
	}

}
