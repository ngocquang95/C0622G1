package ss13_search;

public class LinearSearch {
    public static void main(String[] args) {

    }

    public static int linearSearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (k == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
