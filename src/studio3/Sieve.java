package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number n to find all prime numbers up to n: ");
		int n = scanner.nextInt();

		boolean[] A = new boolean[n];
		for (int i =0; i<n; i++) { 
			A[i]= true ;
		}
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (A[i] == true) {
				for (int j = i * i; j < n; j=j+i) {
					A[j] = false;
				}

			}
			
		}
		for(int i=0; i<n; i++) {
		if (A[i] == true) {
			System.out.println(i); 
		}
		}
	}
}
