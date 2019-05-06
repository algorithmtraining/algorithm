public class Fib_zane {
    public static void main(String[] args) {
        int n = 20;
        Fib_zane fib = new Fib_zane();
        System.out.println(fib.fib(n));
    }


    /**
     * no.509 斐波那契数列
     * @param n
     * @return
     */
    public int fib(int n) {

        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        }else {
            return fib(n - 1) + fib(n - 2);
        }

    }

}
