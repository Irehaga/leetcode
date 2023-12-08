public class Main {
    public static void main(String[] args) {
        MergeSortedArray merger = new MergeSortedArray();

        // Test case 1
        int[] nums1_1 = {1, 2, 3, 0, 0, 0};
        int m1 = 3;
        int[] nums2_1 = {2, 5, 6};
        int n1 = 3;
        merger.merge(nums1_1, m1, nums2_1, n1);
        printArray(nums1_1); // Expected output: [1, 2, 2, 3, 5, 6]

        // Test case 2
        int[] nums1_2 = {4, 5, 6, 0, 0, 0};
        int m2 = 3;
        int[] nums2_2 = {1, 2, 3};
        int n2 = 3;
        merger.merge(nums1_2, m2, nums2_2, n2);
        printArray(nums1_2); // Expected output: [1, 2, 3, 4, 5, 6]

        // Test case 3
        int[] nums1_3 = {0, 0, 0};
        int m3 = 0;
        int[] nums2_3 = {1, 2, 3};
        int n3 = 3;
        merger.merge(nums1_3, m3, nums2_3, n3);
        printArray(nums1_3); // Expected output: [1, 2, 3]
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
