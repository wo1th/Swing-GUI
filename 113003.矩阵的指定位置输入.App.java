import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int[][] arr=new int[10][10];
        Scanner scanner=new Scanner(System.in);
        int row = scanner.nextInt();//数组行数
        int column = scanner.nextInt();//数组列
        int a = scanner.nextInt();//int 型变量

        arr[row][column]=a;

        for (int rowrow = 0; rowrow < arr.length; rowrow++) {
            for (int columnn = 0; columnn < arr[0].length; columnn++) {
                System.out.print(arr[rowrow][columnn]+" ");
            }
            System.out.println();
        }
    }
}
