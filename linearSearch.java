import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size;
        int[] arr = new int[100];
        int find;
        boolean found = false;

        System.out.println("Enter the size of array: ");
        size = scanner.nextInt();

        System.out.print("Enter the elements in array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Which element you want to find: ");
        find = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (arr[i] == find) {
                System.out.println("Found " + find + " at position " + (i + 1));
                found = true;
            }
        }
        if(!found)
        {
            System.out.println(find + " not found in the array");
        }
        scanner.close();
    }
}
