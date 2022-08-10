package ss2_array_loop;

public class ArrayStudy {
    public static void main(String[] args) {
        int[] arr1; //Khai báo
        int[] arr2 = new int[]{1, 2, 3}; //Khai báo và khởi tạo
        int[] arr3; // Khai báo trước
        arr3 = new int[]{1, 2, 3}; // khởi tạo sau
        int arr4[] = new int[]{1, 2, 3}; // Cách của C

        int[] arr5 = new int[10]; // tất cả 10 phần tử đều có giá trị là 0
        arr5[0] = (int) 1.0;// ép kiểu tường minh
        Integer[] arr6 = new Integer[10]; // tất cả 10 phần tử đều có giá trị là null
        String[] arr7 = new String[10]; // tất cả 10 phần tử đều có giá trị là null
        arr7 = new String[5];

        double[] arr8 = new double[10];
        arr8[0] = 10; // ép kiểu ngầm định

        int[] arr9 = {1, 2, 3}; // Khai báo trên 1 dùng thì có thể viết tắt


        int[] arr10 = new int[3];
        arr10[1] = 100;

        System.out.println(arr10[0]);


        int[][] arr11 = new int[][]{{1, 2}, {4, 5}, {6, 7}};
        System.out.println(arr11.length);
        System.out.println(arr11[0].length);
        System.out.println(arr11[0][0]);
    }
}
