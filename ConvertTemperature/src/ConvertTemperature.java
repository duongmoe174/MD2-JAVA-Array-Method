import java.util.Scanner;

public class ConvertTemperature {
    public static void main(String[] args) {
        int choice = -1;
        Scanner menu = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Convert temperature");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("3. Exit");
            choice = menu.nextInt();

            switch (choice) {
                case 1:
                    double f;
                    System.out.println("Nhập vào độ F: ");
                    Scanner inputTempF = new Scanner(System.in);
                    f = inputTempF.nextDouble();
                    System.out.println("Độ C: " + convertFtoC(f));
                    break;
                case 2:
                    double c;
                    System.out.println("Nhập vào độ C: ");
                    Scanner inputTempC = new Scanner(System.in);
                    c = inputTempC.nextDouble();
                    System.out.println("Độ F: " + convertCtoF(c));
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Let choose one!");
            }
        }
    }

    public static double convertFtoC(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double convertCtoF(double c) {
        return c * 9 / 5 + 32;
    }
}
