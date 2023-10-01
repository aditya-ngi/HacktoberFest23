public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7};
        int[] arr1 = {10, 9, 8, 5, 2, 1};

        System.out.println(orderAgnosticBinarySearch(arr, 2));
        System.out.println(orderAgnosticBinarySearch(arr1, 2));
    }

    static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Finding order in which array is sorted
        if (arr[start] < arr[end]) { // Ascending order
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        } else { // Descending order
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (arr[mid] == target) {
                    return mid;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
