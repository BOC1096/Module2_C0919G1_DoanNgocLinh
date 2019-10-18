package B2_MangVaPhuongThucTrongJava.BT_B2TimPhanTuLonNhatTrongMangHaiChieu;

import java.util.Arrays;
import java.util.Scanner;

public class BT_B2TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double val;
        System.out.print("nhap so dong: ");
        int size1 = input.nextInt();
        System.out.print("nhap so cot: ");
        int size2 = input.nextInt();
        double[][] array = new double[size1][size2];
        themPhanTu(input, size1, size2, array);
        for (double[] doubles : array) {
            System.out.println(Arrays.toString(doubles));
        }
        System.out.println(timGiaTriMax(array));
    }

    public static void themPhanTu(Scanner input, int size1, int size2, double[][] array) {
        double val;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                System.out.print("nhap gia tri cua dong " + i + " cot thu " + j + ": ");
                val = input.nextDouble();
                array[i][j] = val;
            }
        }
    }

    private static String timGiaTriMax(double[][] arr) {
        double max = arr[0][0];
        int x = 0, y = 0; //toa do vi tri gia tri lon nhat
        // duyet qua tung phan tu trong mang va so sanh voi max
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    x = i;
                    y = j;
                }
            }
        }
        return "gia tri lon nhat la: " + max + " nam o cot " + x + " hang " + y;
    }
}
