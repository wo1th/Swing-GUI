import java.util.Scanner;

public class App {

//    闰年判断
    void leap(){
        Scanner scanner=new Scanner(System.in);
        int year=scanner.nextInt();
        if (year > 0 && year < 3200) {
            if (year%4 == 0 && year%100 != 0 || year%400 == 0) {
                System.out.println("公元后"+year+"该年是闰年");
            }else{
                System.out.println("公元后"+year+"该年不是闰年");
            }
        }
        if (year < 0 && year> -3200) {
            if (year%4 == -1 && year%400 == -1) {
                System.out.println("公元前"+year+"该年是闰年");
            }else{
                System.out.println("公元前"+year+"该年不是闰年");
            }
        }
    }
    public static void main(String[] args) {
        new App().leap();
    }
}
