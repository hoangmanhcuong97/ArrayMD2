package giatriMax;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        int i = 0;
        while (i < n) {
            System.out.println("Nhap phan tu thu "+(i + 1) +":");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Mang da nhap la: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }
        int max = arr[0];

        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        System.out.println("\nGia tri lon nhat la: "+max);
    }
}
