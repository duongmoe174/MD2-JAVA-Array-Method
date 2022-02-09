import java.util.Scanner;

public class FindMinValue {
    public static void main(String[] args) {
        int[] araay;
        int size;
        Scanner inputSize = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng: ");
        size = inputSize.nextInt();
        if (size > 20) {
            System.out.println("Số phần tử không được nhập quá 20!");
        } else {
            araay = new int[size];
            Scanner inputElement = new Scanner(System.in);
            for (int i = 0; i <araay.length ; i++) {
                System.out.println("Phần tử thứ: " + (i + 1) + ": " );
                araay[i] = inputElement.nextInt();
            }
            System.out.println("Mảng đã cho: ");
            for (int i = 0; i < araay.length; i++) {
                System.out.print(araay[i] + "\t");
            }
            System.out.println(" ");
            System.out.println("Phần tử nhỏ nhất trong mảng là: " + findMin(araay));
        }
    }
    public static int findMin (int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array [i];
            }
        }
        return min;
    }
}
