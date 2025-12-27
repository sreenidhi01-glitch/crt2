public class BubSwapCount {
    public static void main(String[] args) {
        int arr[] = {5, 2, 8, 1, 4};
        int n = arr.length;
        int swapCount = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {                 
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                }
            }
        }
        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal number of swaps: " + swapCount);
    }
}
