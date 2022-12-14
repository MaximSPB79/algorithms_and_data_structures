package lesson_2;

public class Main {

    public static void main(String args[]) {
        int[] arr = {12, 11, 13, 5, 6, 7, 89, 56, 125, 21, 41};
        int n = arr.length;

        HeapSort heapSort = new HeapSort();
        heapSort.sort(arr);

        System.out.println("Sorted array is");
        heapSort.printArray(arr);
    }
}
