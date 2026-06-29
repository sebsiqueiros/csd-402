/*
 * Name: Sebastian Siqueiros
 * Assignment: 5.2
 * Course: CSD-405
 *
 * This program contains overloaded methods that locate the largest
 * and smallest elements in both int and double two-dimensional arrays.
 * Each method returns the row and column location of the element.
 */

public class Siqueiros_Mod5_2 {

    // Locate largest element in a double array
    public static int[] locateLargest(double[][] arrayParam) {
        int[] location = {0, 0};
        double largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate largest element in an int array
    public static int[] locateLargest(int[][] arrayParam) {
        int[] location = {0, 0};
        int largest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > largest) {
                    largest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest element in a double array
    public static int[] locateSmallest(double[][] arrayParam) {
        int[] location = {0, 0};
        double smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    // Locate smallest element in an int array
    public static int[] locateSmallest(int[][] arrayParam) {
        int[] location = {0, 0};
        int smallest = arrayParam[0][0];

        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < smallest) {
                    smallest = arrayParam[i][j];
                    location[0] = i;
                    location[1] = j;
                }
            }
        }

        return location;
    }

    public static void main(String[] args) {

        int[][] intArray = {
                {4, 12, 7},
                {9, 3, 15},
                {8, 2, 10}
        };

        double[][] doubleArray = {
                {4.5, 8.1, 2.3},
                {9.7, 1.2, 5.6},
                {3.4, 7.8, 6.9}
        };

        int[] largestInt = locateLargest(intArray);
        int[] smallestInt = locateSmallest(intArray);

        int[] largestDouble = locateLargest(doubleArray);
        int[] smallestDouble = locateSmallest(doubleArray);

        System.out.println("Integer Array");
        System.out.println("Largest element is at row " + largestInt[0]
                + ", column " + largestInt[1]);

        System.out.println("Smallest element is at row " + smallestInt[0]
                + ", column " + smallestInt[1]);

        System.out.println();

        System.out.println("Double Array");
        System.out.println("Largest element is at row " + largestDouble[0]
                + ", column " + largestDouble[1]);

        System.out.println("Smallest element is at row " + smallestDouble[0]
                + ", column " + smallestDouble[1]);
    }
}