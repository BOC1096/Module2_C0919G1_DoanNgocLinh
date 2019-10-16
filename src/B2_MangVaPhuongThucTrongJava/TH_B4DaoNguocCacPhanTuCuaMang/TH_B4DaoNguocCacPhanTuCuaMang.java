package B2_MangVaPhuongThucTrongJava.TH_B4DaoNguocCacPhanTuCuaMang;

import java.util.Scanner;

public class TH_B4DaoNguocCacPhanTuCuaMang {
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
        }
        System.out.printf("%-20s%s", "Mang da nhap: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        System.out.printf("%-20s%s", "Mang sau khi dao nguoc: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(daoNguocMang(array)[j] + "\t");
        }
    }

    static int[] daoNguocMang(int[] arr1) {
        int[] arr2 = new int[arr1.length];
        int j = 0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            arr2[j] = arr1[i];
            j++;
        }
        return arr2;
    }
}
