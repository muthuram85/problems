package day2;

public class Fibonacci {

	public static int fibRec(int n) {
		if (n == 0 || n == 1)
			return 1;
		return fibRec(n - 1) + fibRec(n - 2);
	}

	public static int fibDP(int n, int[] dp) {
		if (dp[n] != 0)
			return dp[n];
		if (n == 0 || n == 1)
			return 1;
		return dp[n] = fibDP(n - 1, dp) + fibDP(n - 2, dp);
	}
	
	public static int fib(int n) {
		if(n == 0 || n == 1)
			return 1;
		int sum = 0;
		int a = 1; 
		int b = 1;
		for(int i = 2; i <= n; i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return sum;
	}
	public static void main(String[] args) {
		System.out.println("The " + 10 + " fibonacci number is " + fib(10));
		System.out.println("The " + 10 + " fibonacci number is " + fib(25));
		System.out.println("The " + 10 + " fibonacci number is " + fibRec(10));
		System.out.println("The " + 10 + " fibonacci number is " + fibDP(10, new int[11]));
		System.out.println("The " + 100 + " fibonacci number is " + fibDP(25, new int[26]));
	}

}
