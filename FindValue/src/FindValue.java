import java.util.Scanner;

public class FindValue {
    public static void main(String[] args) {
//        int size;
//        String [] students;
//        Scanner inputName = new Scanner(System.in);
//        do {
//            System.out.println("Nhập vào số người: ");
//            size = inputName.nextInt();
//            if (size > 20) {
//                System.out.println("Không được nhập quá 20 người!");
//            }
//        } while (size > 20);
//        students = new String[size];
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("Enter name of person " + (i+1) + ": ");
//            students[i] = inputName.nextLine();
//        }
//        System.out.println("Group: ");
//        for (int i = 0; i < students.length; i++) {
//            System.out.println(students[i] + "\t");
//        }
        String [] students = {"Duong", "Son", "Tuan", "Hai", "Quan"};
        Scanner checkName = new Scanner(System.in);
        System.out.println("Nhập tên cần tìm: ");
        String inputName = checkName.nextLine();

        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if(students[i].equals(inputName)) {
                System.out.println("Tên bạn: " + inputName + " ở vị trí thứ: " + i);
                isExist = true;
                break;
            }
        }
        if(!isExist) {
            System.out.println(inputName + "Hông có bé ơi");
        }
    }
}
