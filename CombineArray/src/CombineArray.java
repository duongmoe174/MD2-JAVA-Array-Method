import java.util.Scanner;

public class CombineArray {
    public static void main(String[] args) {
        //Begin Initialization Array 1 & Array 2
        int[] array1;
        int[] array2;
        int size1;
        int size2;
        Scanner inputNumber1 = new Scanner(System.in);
        System.out.println("Input number of Array1: ");
        size1 = inputNumber1.nextInt();
        array1 = new int[size1];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input value on index of " + i);
            Scanner inputElement1 = new Scanner(System.in);
            array1[i] = inputElement1.nextInt();
        }
        System.out.println("Array 1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + "\t");
        }
        System.out.println(" ");
        Scanner inputNumber2 = new Scanner(System.in);
        System.out.println("Input number of Array2: ");
        size2 = inputNumber2.nextInt();
        array2 = new int[size2];
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Input value on index of " + i);
            Scanner inputElement2 = new Scanner(System.in);
            array2[i] = inputElement2.nextInt();
        }
        System.out.println("Array 2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i] + "\t");
        }
        //End
        /*-------------------------------------*/
        // Start Initialization Array 3
        int[] array3 = new int [size1 + size2];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0, j = array1.length; i < array2.length ; i++, j++) {
            array3[j] = array2[i];
        }
        System.out.println("Array 3: ");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
