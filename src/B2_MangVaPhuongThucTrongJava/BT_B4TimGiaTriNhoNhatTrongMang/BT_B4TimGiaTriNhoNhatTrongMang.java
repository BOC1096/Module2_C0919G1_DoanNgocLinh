package B2_MangVaPhuongThucTrongJava.BT_B4TimGiaTriNhoNhatTrongMang;

import B2_MangVaPhuongThucTrongJava.BT_B3GopMang.BT_B3GopMang;
import java.util.Scanner;
import java.util.Arrays;

public class BT_B4TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        int[] array;
        System.out.print("nhap do dai mang: ");
        size = input.nextInt();
        array = new int[size];
        BT_B3GopMang.nhapMang(size, array);
        System.out.print("mang la: ");
        System.out.println(Arrays.toString(array));
        System.out.println("Phan tu co gia tri nho nhat la: " + timGiaTriMin(array));
    }

    static int timGiaTriMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
