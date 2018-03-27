import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        int n;//number element
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Input size array:");
            n = scanner.nextInt();
        } while (n <= 0);
        //in put element
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Input element:" + (i) + ":");
            array[i] = scanner.nextInt();
        }
        //Property array
        System.out.print("Array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        //sort array c1
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        //sort array c2 noi bot
//        for (int i = 1; i < n; i++) {
//            for (int j = n - 1; j >= i; j--) {
//                if (array[i-1] > array[i]) {
//                    int temp = array[i-1];
//                    array[i-1] = array[i];
//                    array[i] = temp;
//                }
//            }
//        }

        System.out.print("Array before sort:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
