package example1;

public class Parallel {

    public static void main(String[] args) {
        long currentTimeInMilliseconds1 = System.currentTimeMillis();
        Runnable firstTask = calculateAddition(40, 2);
        Runnable secondTask = calculateDivision(40, 2);
        Thread myFirstThread = new Thread(firstTask);
        Thread mySecondThread = new Thread(secondTask);
        try {
            //myFirstThread.join();
            myFirstThread.start();
            //mySecondThread.join();
            mySecondThread.start();
        //} catch (InterruptedException e) {
        } catch (Exception e) {
            e.printStackTrace();
        }
        long currentTimeInMilliseconds2 = System.currentTimeMillis();
        System.out.println("Total time spent to do both calculations " + (currentTimeInMilliseconds2 - currentTimeInMilliseconds1));
    }

    private static Runnable calculateAddition(int a, int b) {

        return new Runnable() {
            @Override
            public void run() {
                //lets assume it takes a longer time to do addition
                try {
                    Thread.sleep(100);
                    System.out.println(a + b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }

    private static Runnable calculateDivision(int a, int b) {

        return new Runnable() {
            @Override
            public void run() {
                //lets assume it takes a longer time to do addition
                try {
                    Thread.sleep(200);
                    System.out.println(a / b);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
    }
}
