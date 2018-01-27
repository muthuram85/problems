package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class FindTheOneMissing {

	public static int missingOne(Integer[] a) {
		int n = a.length;
		int sum = n * (n + 1) / 2;
		for(int i = 0; i < a.length; i ++)
			sum -= a[i];
		return sum;
	}
	
	public static void main(String[] args) {
		Integer[] a = {2,3,7,1,5,6,4,8,9};
		List<Integer> l =  new ArrayList<>();
		for(int i = 0; i < a.length; i ++)
			l.add(a[i]);
		Random r = new Random();
		Collections.shuffle(l);
		a = l.toArray(a);
		System.out.println(Arrays.toString(a));
		int nextInt = r.nextInt(a.length -1);
		System.out.println("Random value removed was - " + a[nextInt]);
		a[nextInt] = 0;
		System.out.println("The missing value is - " +  missingOne(a));
	}

}
