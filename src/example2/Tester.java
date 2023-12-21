package example2;

public class Tester {

    public static void main(String[] args) {
        int[] array = {23,12,155,21};
        MyOwnTread myOwnTread = new MyOwnTread(array);
        myOwnTread.start();
    }
}
