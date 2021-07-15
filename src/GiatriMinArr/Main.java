package GiatriMinArr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu mang:");
        int Size = sc.nextInt();
        int[] arr = new int[Size];
        int i = 0;
        while (i < Size) {
            System.out.println("Nhap phan tu thu " + (i + 1) + ":");
            arr[i] = sc.nextInt();
            i++;
        }
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if(arr[j] < min){
                min = arr[j];
            }
        }
        System.out.println("Gia tri nho nhat trong mang la: " + min);
    }
}
