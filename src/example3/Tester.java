package example3;

import example2.MyOwnTread;

public class Tester {


    public static void main(String[] args) {
        int[] array = {23,12,155,21};
        MyOwnRunnable myOwnRunnable = new MyOwnRunnable(array);
        Thread thread = new Thread(myOwnRunnable);
        thread.start();
    }
}
