package day2;

public class LongestCommonSubsequence {

	public static int lcs(String a, String b) {
		int[][] dp = new int[a.length() + 1][b.length() + 1];

		for (int i = 1; i <= a.length(); i++)
			for (int j = 1; j <= b.length(); j++)
				if (a.charAt(i - 1) == b.charAt(j - 1))
					dp[i][j] = dp[i - 1][j - 1] + 1;
				else
					dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
		return dp[a.length()][b.length()];
	}

	public static void main(String[] args) {
		System.out.println("The lcs of the strings " + "(abcdef)" + " and " + "(abdf) is " + lcs("acbdef", "abdf"));
		System.out.println(
				"The lcs of the strings " + "(abcdefgh)" + " and " + "(abdfh) is " + lcs("abcdefgh", "abdghf"));
		System.out.println("The lcs of the strings " + "(abcdaf)" + " and " + "(acbcf) is " + lcs("abcdaf", "acbcf"));
	}

}
