package ChuoiKyTu;

import java.util.Scanner;

public class DesplayChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 1 chuoi ky tu: ");
        String name = sc.nextLine();
        char chart = 'a';

        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            if(chart == name.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
