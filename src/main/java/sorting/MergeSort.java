package sorting;

public class MergeSort {
    void sort (int[] arr, int s, int e) {
        int m = (e - s) / 2;
        sort(arr, s, m);
        sort(arr, m+1, e);
    }
    int[] mergeSortedSubArrays(int[] arr, int s1, int e1, int s2, int e2);
}
