package com.example.DSA;

public class MatrixOperationsExample {

	    public static void printMatrix(int[][] matrix) {
	        for (int[] row : matrix) {
	            for (int value : row) {
	                System.out.print(value + " ");
	            }
	            System.out.println();
	        }
	    }

	    public static int[][] addMatrices(int[][] matrixA, int[][] matrixB) {
	        int rows = matrixA.length;
	        int columns = matrixA[0].length;
	        int[][] result = new int[rows][columns];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                result[i][j] = matrixA[i][j] + matrixB[i][j];
	            }
	        }

	        return result;
	    }

	    public static int[][] multiplyMatrices(int[][] matrixA, int[][] matrixB) {
	        int rowsA = matrixA.length;
	        int columnsA = matrixA[0].length;
	        int columnsB = matrixB[0].length;
	        int[][] result = new int[rowsA][columnsB];

	        for (int i = 0; i < rowsA; i++) {
	            for (int j = 0; j < columnsB; j++) {
	                for (int k = 0; k < columnsA; k++) {
	                    result[i][j] += matrixA[i][k] * matrixB[k][j];
	                }
	            }
	        }

	        return result;
	    }

	    public static int[][] transposeMatrix(int[][] matrix) {
	        int rows = matrix.length;
	        int columns = matrix[0].length;
	        int[][] result = new int[columns][rows];

	        for (int i = 0; i < rows; i++) {
	            for (int j = 0; j < columns; j++) {
	                result[j][i] = matrix[i][j];
	            }
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        int[][] matrixA = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };

	        int[][] matrixB = {
	            {9, 8, 7},
	            {6, 5, 4},
	            {3, 2, 1}
	        };

	        System.out.println("Matrix A:");
	        printMatrix(matrixA);

	        System.out.println("Matrix B:");
	        printMatrix(matrixB);

	        int[][] sum = addMatrices(matrixA, matrixB);
	        System.out.println("Matrix A + Matrix B:");
	        printMatrix(sum);

	        int[][] product = multiplyMatrices(matrixA, matrixB);
	        System.out.println("Matrix A * Matrix B:");
	        printMatrix(product);

	        int[][] transposed = transposeMatrix(matrixA);
	        System.out.println("Transpose of Matrix A:");
	        printMatrix(transposed);
	    }
	}
