public class App {
    public static void main(String[] args) {
        long sum = 0;
        for (long i = 1; i <= 2147483647; i += 2) {
            sum += i;
        }
        System.out.println("1到2147483647的奇数和为：" + sum);
    }
}
