public class AddElement {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        a = addElement(a, 100);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static int[] addElement(int[] arr, int newE) {
        int newArr[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[newArr.length -1] = newE;
        return newArr;
    }
}
