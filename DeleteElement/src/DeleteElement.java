public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        deleteElement(array, 3);
    }

    public static void deleteElement(int[] arr, int x) {
        int indexDel = -1;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("Phần tử " + x + " ở chỉ số thứ " + i);
                indexDel = i;
            }
        }
        if (indexDel == -1) {
            System.out.println("Không có phần tử này!");
        } else {
            int[] newArray = new int[arr.length - 1];
            for (int i = 0; i < indexDel; i++) {
                newArray[i] = arr[i];
            }
            for (int i = indexDel; i < newArray.length; i++) {
                newArray[i] = arr[i + 1];
            }
            arr = newArray;
            System.out.println(" mảng mới là: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i] + "\t");
            }
        }
    }
}

