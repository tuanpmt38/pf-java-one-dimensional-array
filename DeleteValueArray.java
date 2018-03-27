import java.util.Scanner;

public class DeleteValueArray {
    public static void main(String[] args) {
        int n;// number element
        int[] num;
        Scanner scanner = new Scanner(System.in);
        //enter array
        do {
            System.out.print("Enter size:");
            n = scanner.nextInt();
        } while (n <= 0);
        //enter element
        num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i) + ":");
            num[i] = scanner.nextInt();
        }
        //delete element
        int x;
        System.out.print("Enter element delete: ");
        x = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            if (x == num[i]) {
                for (int j = i; j < n - 1; j++) {
                    num[j] = num[j+1];

                }
                n--;
            }
        }
        //before element sort
        System.out.print("Sort before delete element: \t");
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + "\t");
        }
    }
}
