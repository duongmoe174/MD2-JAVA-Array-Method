import java.util.Scanner;

public class FindMaxValue {
    public static void main(String[] args) {
        int size;
        int array[];
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng: ");
        size = inputNumber.nextInt();
        array = new int[size];
        if (size > 20) {
            System.out.println("Số phần tử nhập không được quá 20!");
        } else {
            for (int i = 0; i < array.length; i++) {
                System.out.println("Phần tử thứ " + (i+1) + " : ");
                array[i] = inputNumber.nextInt();
            }
        }
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                break;
            }
        }
        System.out.println("phần tử lớn nhất ở trong mảng là: " + max);
    }
}

