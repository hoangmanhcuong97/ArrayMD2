package DanhSachSinhVien;

import java.util.Scanner;

public class ListStudent {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Nhap so luong sinh vien nhap vao: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30");
            }
        } while (size > 30);

        arr = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Nhap diem so hs thu " + (i + 1) + ":");
            arr[i] = scanner.nextInt();
            i++;
        }

        int count = 0;
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
            if(arr[j] >= 5 && arr[j] <= 10){
               count++;
            }
        }
        System.out.println("\n The number of students passing the exam is " + count);
    }
}
