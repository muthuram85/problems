package day1;

public class NumberOfOnesInInteger {

	public static int numberOfOnes(int number) {
		number = Math.abs(number);
		int count = 0;
		while (number > 0) {
			if (number % 10 == 1)
				count++;
			number = number / 10;
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println("111 - " + ((numberOfOnes(111) == 3) ? "Passed" : "Failed"));
		System.out.println("-111 - " + ((numberOfOnes(-111) == 3) ? "Passed" : "Failed"));
		System.out.println("512 - " + ((numberOfOnes(512) == 1) ? "Passed" : "Failed"));
		System.out.println("0 - " + ((numberOfOnes(0) == 0) ? "Passed" : "Failed"));
		System.out.println("1212121 - " + ((numberOfOnes(1212121) == 4) ? "Passed" : "Failed"));
		System.out.println("65421- " + ((numberOfOnes(65421) == 1) ? "Passed" : "Failed"));
	}

}
