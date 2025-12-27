public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {11, 22, 33, 44, 55};
        int key = 33;
        int left = 0, right = arr.length - 1, mid;
        boolean found = false;
        while (left <= right) {
            mid = (left + right) / 2;

            if (arr[mid] == key) {
                found = true;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(found ? key + " found" : key + " not found");
    }
}
