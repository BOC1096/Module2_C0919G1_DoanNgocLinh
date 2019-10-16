package B2_MangVaPhuongThucTrongJava.TH_B3TimGiaTriLonNhatTrongMang;

import java.util.Scanner;

public class TH_B3TimGiaTriLonNhatTrongMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("nhap size mang");
            size = input.nextInt();
            if (size > 20) {
                System.out.println("size khong hop le, vui long nhap lai");
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.println("Nhap phan tu thu " + (i + 1) + " vao mang: ");
            array[i] = input.nextInt();
            i++;
            System.out.println(TimGiaTriLonNhat(array));
        }
    }

    static String TimGiaTriLonNhat(int[] arr) {
        int max = arr[0];
        String total = "";
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            total = "gia tri lon nhat la: " + max + " o vi tri " + i;
        }
        return total;
    }
}
