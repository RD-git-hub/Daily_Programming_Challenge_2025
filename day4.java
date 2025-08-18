public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int gap = (m + n + 1) / 2;

        while (gap > 0) {
            int i = 0;
            int j = gap;

            while (j < m + n) {
                int val1 = (i < m) ? arr1[i] : arr2[i - m];
                int val2 = (j < m) ? arr1[j] : arr2[j - m];

                if (val1 > val2) {
                    if (i < m && j < m) {
                        int temp = arr1[i];
                        arr1[i] = arr1[j];
                        arr1[j] = temp;
                    } else if (i < m && j >= m) {
                        int temp = arr1[i];
                        arr1[i] = arr2[j - m];
                        arr2[j - m] = temp;
                    } else {
                        int temp = arr2[i - m];
                        arr2[i - m] = arr2[j - m];
                        arr2[j - m] = temp;
                    }
                }

                i++;
                j++;
            }

            if (gap == 1) break;
            gap = (gap + 1) / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        merge(arr1, arr2);

        System.out.print("arr1 = ");
        for (int num : arr1) System.out.print(num + " ");
        System.out.print("\narr2 = ");
        for (int num : arr2) System.out.print(num + " ");
    }
}
