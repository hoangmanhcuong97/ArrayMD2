package GiatriMaxArr2Chieu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ban co muon kich hoat ma tran khong? (Yes: chon 1, No: chon 0)");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("Nhap so dong:");
            int row = sc.nextInt();
            System.out.println("Nhap so cot: ");
            int col = sc.nextInt();
            int[][] arr = new int[row][col];

            for (int r = 0; r < arr.length; r++) {
                for (int c = 0; c < arr[0].length; c++) {
                    System.out.println("Nhap phan tu o vtri "+ (1 + r) +""+ (1 + c)+":" );
                    arr[r][c] = sc.nextInt();
                }
            }
            System.out.println("Ma tran moi tao se co dang la:");
            for (int r = 0; r < arr.length; r++) {
                for (int c = 0; c < arr[0].length; c++) {
                    System.out.print(arr[r][c] + "\t");
                }
                System.out.print("\n");
            }

            int max = arr[0][0];
            for (int r = 0; r < arr.length; r++) {
                for (int c = 0; c < arr[0].length; c++) {
                    if (arr[r][c] > max ){
                        max = arr[r][c];
                    }
                }
            }
            System.out.println("Gia tri lon nhat trong ma tran "+ row +"x"+ col + " la: " + max);
        }else if(choice == 0){
            System.exit(0);
        }

    }
}
