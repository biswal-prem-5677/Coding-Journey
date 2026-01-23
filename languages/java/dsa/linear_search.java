import java.util.Scanner;

class LinearSearch {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        int index = -1; 
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }


        if (index != -1) {
            System.out.println("Element found at index position: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
