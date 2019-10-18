package B2_MangVaPhuongThucTrongJava.BT_B7TinhTongCacChiSoDuongCheoCuaMaTran;

import java.util.Arrays;
import java.util.Scanner;

public class BT_B7TinhTongCacChiSoDuongCheoCuaMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap size cua mang:");
        int size = scanner.nextInt();
        int[][] array = new int[size][size];
        themPhanTu(size, array);
        for (int[] integers : array) {
            System.out.println(Arrays.toString(integers));
        }
        System.out.println("Tong cua hang cheo 1 la: " + tongGiaTriDuongCheo1(array));
        System.out.println("Tong cua hang cheo 2 la: " + tongGiaTriDuongCheo2(array));
    }

    public static void themPhanTu(int size, int[][] array) {
        Scanner input = new Scanner(System.in);
        int val;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("nhap gia tri cua dong " + i + " cot thu " + j + ": ");
                val = input.nextInt();
                array[i][j] = val;
            }
        }
    }

    private static int tongGiaTriDuongCheo1(int[][] arr) {
        int total = 0, i = 0;
        for (; i < arr.length; i++) {
            total += arr[i][i];
        }
        return total;
    }
    private static int tongGiaTriDuongCheo2(int[][] arr) {
        int total = 0, i = arr.length - 1;
        for (; i >= 0; i--) {
            total += arr[i][i];
        }
        return total;
    }
}