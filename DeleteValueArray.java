import java.util.Scanner;

public class DeleteValueArray {
    public static void main(String[] args) {
        int size;// number element
        int[] arr_number;
        Scanner scanner = new Scanner(System.in);
        //enter array
        do {
            System.out.print("Enter size:");
            size = scanner.nextInt();
        } while (size <= 0);
        //enter element
        arr_number = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i) + ":");
            arr_number[i] = scanner.nextInt();
        }
        System.out.println("Display arr number");
        for (int arr:arr_number) {
            System.out.print(" "+arr);
        }
        System.out.println();
        //delete element
        int value;
        System.out.println("Enter element delete: ");
        value = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (value == arr_number[i]) {
                for (int j = i; j < size - 1; j++) {
                    arr_number[j] = arr_number[j + 1];

                }
                size--;
            }
        }
        //before element sort
        System.out.print("Sort before delete element: \t");
        for (int i = 0; i < size; i++) {
            System.out.print(arr_number[i] + "\t");
        }
    }
}
