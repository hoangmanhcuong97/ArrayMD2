package addSumColum;

import java.util.Scanner;

public class SumColum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter col: ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];

        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                System.out.println("Enter position "+ (1 + r) +""+ (1 + c)+":" );
                arr[r][c] = sc.nextInt();
            }
        }
        System.out.println("Ma tran moi co dang:");
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {
                System.out.print(arr[r][c] + "\t");
            }
            System.out.print("\n");
        }

        System.out.println("Nhap vi tri cot ma ban muon tinh tong");
        int pos = sc.nextInt();
        int sum = 0;
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[0].length; c++) {}
            sum += arr[r][pos -1];
        }
        System.out.println("Tong ma ban muon tinh o cot "+ pos + ": " + sum);
    }
}
