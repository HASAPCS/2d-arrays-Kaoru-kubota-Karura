package com.example;

public class TwoDArrayOperations {

    public static void main(String[] args) {
        // Exercise 1: Initialize and Print a 2D Array
        // TODO: Initialize a 2D array of integers and print its contents in a matrix form.
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        printArray(array);
    }

    // Exercise 2: Find the Maximum Value in a 2D Array
    public static int findMaximumValue(int[][] array) {
        int max = Integer.MIN_VALUE;
        for (int[] row : array) {
            for (int value : row) {
                max = Math.max(max, value);
            }
        }
        return max;
    }

    // Exercise 3: Check for a Specific Value in a 2D Array
    public static boolean containsValue(int[][] array, int value) {
        for (int[] row : array) {
            for (int element : row) {
                if (element == value) {
                    return true;
                }
            }
        }
        return false;
    }

    // Exercise 4: Calculate the Average of All Elements in a 2D Array
    public static double calculateAverage(int[][] array) {
        int sum = 0;
        int count = 0;
        for (int[] row : array) {
            for (int value : row) {
                sum += value;
                count++;
            }
        }
        return (double) sum / count;
    }

    // Exercise 5: Sum of Diagonal Elements in a 2D Array
    public static int sumDiagonal(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i][i];
        }
        return sum;
    }

    // Exercise 6: Flatten a 2D Array into 1D Array
    public static int[] flattenArray(int[][] array) {
        int rows = array.length;
        int cols = array[0].length;
        int[] result = new int[rows * cols];
        int index = 0;
        for (int[] row : array) {
            for (int value : row) {
                result[index++] = value;
            }
        }
        return result;
    }
    

    // 確認用
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
