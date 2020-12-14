import java.util.Scanner;

public class App {

//    斐波那契数列
    public static long fibonacci(long number) {
        if ((number == 0) || (number == 1))
            return number;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
    void fibon(){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        if (a >=1 && a<=40) {
            System.out.printf("%d 的斐波那契数是: %d\n",a, fibonacci(a));
        }
    }
    public static void main(String[] args) {
        new App().fibon();
    }
}
