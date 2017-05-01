package in.pillisureshraju.algorithms.hackerrank;

import java.util.Scanner;

public class DijkstraShortestRoute2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int weight_matrix[][] = null;
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt(); // Vertices
            int m = in.nextInt(); // Edges
            weight_matrix = new int[n][n];
            for(int a1 = 0; a1 < m; a1++){
                int x = in.nextInt(); // Source Edge
                int y = in.nextInt(); // Destination Edge
                int r = in.nextInt(); // Weight
                weight_matrix[x-1][y-1] = r;
            }
            int s = in.nextInt(); // Starting Edge
            //printWeigthMatrix(weight_matrix);
            // Get the direct distances of the selected source
        }
        
        
        in.close();
    }

	/**
	 * @param weight_matrix
	 */
	private static void printWeigthMatrix(int[][] weight_matrix) {
		for(int i = 0; i < weight_matrix.length; i++ ) {
        	for (int j = 0; j < weight_matrix[i].length; j++ ) {
        		System.out.print(weight_matrix[i][j] + " ");
        	}
        	System.out.println();
        }
	}
}

class WeigthedGraph {
	
}
