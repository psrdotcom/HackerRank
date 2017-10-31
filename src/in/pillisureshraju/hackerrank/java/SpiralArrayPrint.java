/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Suresh Raju Pilli
 */
package in.pillisureshraju.hackerrank.java;

import java.util.Scanner;

public class SpiralArrayPrint {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int data[][] = null;
		// System.out.println("Enter No.of Rows and No.of Cols");
		int n = in.nextInt(); // rows
		int m = in.nextInt(); // cols
		data = new int[n][m];
		// System.out.println("Enter data in matrix format seperated with space");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				data[i][j] = in.nextInt();
			}
		}

		// Print outer matrix values as spiral
		printOuterMatrix(data);

		// Close the scanner
		in.close();

		// Print array
		/*
		 * System.out.println("Array elements are: "); for (int i = 0; i < n; i++) { for
		 * (int j = 0; j < m; j++) { System.out.print(data[i][j] + " "); }
		 * System.out.println(); }
		 */
	}

	private static void printOuterMatrix(int[][] data) {

		int n = data.length;
		int m = data[0].length;
		int totalVals = n * m;
		int round = 0;
		int colIdx = 0;
		int count = 0;

		while (count < totalVals) {

			// Logic - Spiral array print
			// Print 1 row - last value
			for (int j = colIdx; j < m; j++) {
				System.out.print(data[round][j] + " ");
				count++;
			}
//			System.out.println();
			if(count == totalVals) break;
			

			// Print last column - Last value
			for (int i = round + 1; i < n - 1; i++) {
				System.out.print(data[i][m - 1] + " ");
				count++;
			}
//			System.out.println();
			if(count == totalVals) break;
			
			// Print last row in reverse
			for (int j = m - 1; j >= round; j--) {
				System.out.print(data[n - 1][j] + " ");
				count++;
			}
//			System.out.println();
			if(count == totalVals) break;
			
			// Print 1 column in reverse - already printed first and last value
			for (int i = n - 2; i > round; i--) {
				System.out.print(data[i][round] + " ");
				count++;
			}
//			System.out.println();
			if(count == totalVals) break;
			
			// Value changes
			n--;
			m--;
			round++;
			colIdx++;
		}
	}
}
