package example3;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyOwnRunnable implements Runnable {

    private int[] arr;

    public MyOwnRunnable(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("before (selection-sort) sorting the array " + list);
        selectionSort();
        List<Integer> sortedList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Sorted array  (selection-sort) " + sortedList);
    }

    private void selectionSort() {

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int n = arr.length;

        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}