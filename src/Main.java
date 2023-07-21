import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the row: ");
        int row=scanner.nextInt();
        System.out.println("Enter the col: ");
        int col=scanner.nextInt();
        System.out.println("Enter the values: ");
        int[][] arr = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter B: ");
        int B=scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] *=B;
                System.out.println(arr[i][j
                        ]);
            }
        }

    }
}