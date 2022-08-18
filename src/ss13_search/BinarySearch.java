package ss13_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 200, 500};
        int em = 51;

        int index = binarySearch(arr, em, 0, arr.length - 1);

        if (index == -1 ) {
            System.out.println("Không tìm thấy em");
        } else {
            System.out.println("Vị trí index tìm thấy: " + index);
        }
    }

    public static int binarySearch(int[] arr, int k, int left, int right) {
        if (right >= left) {
            // Lấy phần tử mid
            int mid = (left + right) / 2;

            // Nếu k == arr[mid]
            if (k == arr[mid]) {
                return mid;
            }

            // Nếu k > arr[mid]
            if (k > arr[mid]) {
                return binarySearch(arr, k, mid + 1, right);
            }

            // Nếu k < arr[mid]
            return binarySearch(arr, k, left, mid - 1);
        }

        return -1;
    }
}
