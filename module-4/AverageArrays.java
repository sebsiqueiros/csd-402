/*Sebastian Siqueiros    Module 4.2 Assignment    
   This program test program that invokes each of these methods and then displays the average value returned, along with a display of the original array elements. */




public class AverageArrays {

    // Average for short array
    public static short average(short[] array) {
        short sum = 0;

        for (short num : array) {
            sum += num;
        }

        return (short)(sum / array.length);
    }

    // Average for int array
    public static int average(int[] array) {
        int sum = 0;

        for (int num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    // Average for long array
    public static long average(long[] array) {
        long sum = 0;

        for (long num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    // Average for double array
    public static double average(double[] array) {
        double sum = 0;

        for (double num : array) {
            sum += num;
        }

        return sum / array.length;
    }

    public static void main(String[] args) {

        // Arrays of different sizes
        short[] shortArray = {10, 20, 30};

        int[] intArray = {5, 10, 15, 20};

        long[] longArray = {100, 200, 300, 400, 500};

        double[] doubleArray = {2.5, 3.5, 4.5, 5.5, 6.5, 7.5};

        // Display short array
        System.out.println("Short Array:");
        for (short num : shortArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage = " + average(shortArray));

        System.out.println();

        // Display int array
        System.out.println("Int Array:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage = " + average(intArray));

        System.out.println();

        // Display long array
        System.out.println("Long Array:");
        for (long num : longArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage = " + average(longArray));

        System.out.println();

        // Display double array
        System.out.println("Double Array:");
        for (double num : doubleArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nAverage = " + average(doubleArray));
    }
}