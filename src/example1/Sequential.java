package example1;

public class Sequential {

    public static void main(String[] args) {
        long currentTimeInMilliseconds1 = System.currentTimeMillis();
        calculateAddition(40, 2);
        calculateDivision(40, 2);
        long currentTimeInMilliseconds2 = System.currentTimeMillis();
        System.out.println("Total time spent to do both calculations " + (currentTimeInMilliseconds2 - currentTimeInMilliseconds1));
    }

    private static void calculateAddition(int a, int b) {
        //lets assume it takes a longer time to do addition
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a + b);
    }

    private static void calculateDivision(int a, int b) {
        //lets assume it takes a longer time to do addition
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a / b);
    }
}
