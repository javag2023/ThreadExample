package example2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MyOwnTread extends Thread {
    private int[] arr;

    public MyOwnTread(int[] integers) {
        this.arr = integers;
    }

    @Override
    public void run() {
        List<Integer> list = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("before sorting the array " + list);
        bubbleSort();
        List<Integer> sortedList = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("Sorted array " + sortedList);
    }

    private void bubbleSort() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int n = arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
    }
}