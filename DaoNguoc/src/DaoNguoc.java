import java.util.Scanner;

public class DaoNguoc {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Nhập vào số phần tử của mảng: ");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("Số phần tử không vượt quá 20");
            }
        } while (size > 20);
        array = new int[size];
        for (int i = 0; i < array.length ; i++) {
            System.out.println("Enter element  " + (i +1) + ": ");
            array[i] = input.nextInt();
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length / 2 ; i++) {
            int temp = array[i];
            array[i] = array[size - 1 - i];
            array[size - 1 - i] = temp;
        }
        System.out.printf("\n%-20s%s", "Reverse array: ", "");
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
