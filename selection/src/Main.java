public class Main {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {8, 9, 5, 3, 2, 4};
        int minIndex = -1;
        int size = arr.length;
        System.out.println("Before Swaping");
        for (int nums : arr) {
            System.out.print(nums + " ");
        }
        for (int i = 0; i < size - 1; i++)
        {
            minIndex = i;
            for (int j = i + 1; j < size; j++)
            {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }
                temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;

                System.out.println();
                for (int nums : arr) {
                    System.out.print(nums + " ");

                }
            }
            System.out.println();
            System.out.println("After Swaping");
            for (int nums : arr) {
                System.out.print(nums + " ");
            }
        }
    }
