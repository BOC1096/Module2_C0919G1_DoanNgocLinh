package B2_MangVaPhuongThucTrongJava.BT_B5XoaPhanTuKhoiMang;

import java.util.Arrays;
import java.util.Scanner;

public class BT_B5XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1, 2, 3, 6, 2, 2};
        int val;
        System.out.println("nhap gia tri muon xoa");
        val = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                count++;
            }
        }
        int[] arrayNew = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == val) {
                continue;
            }
            arrayNew[j] = array[i];
            j++;
        }
        System.out.println("mang moi la: " + Arrays.toString(arrayNew));
    }
}
