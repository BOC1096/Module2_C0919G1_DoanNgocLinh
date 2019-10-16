package B2_MangVaPhuongThucTrongJava.BT_B1ThemPhanTuVaoMang;

import java.util.Arrays;
import java.util.Scanner;

public class BT_B1ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array;
        System.out.println("Nhap vao do dai mang: ");
        int size = input.nextInt();
        int index;
        array = new int[size];
        while (true) {
            System.out.println("Nhap vao phan tu muon chen: ");
            int element = input.nextInt();
            System.out.println("Nhap vap vi tri muon chen: ");
            index = input.nextInt();
            if (index < 0 || index > size - 1) {
                System.out.println("index invalid");
                continue;
            }
            if (index == size - 1) {
                array[index] = element;
            } else {
                for (int i = size - 1; i > index; i--) {
                    array[i] = array[i - 1];
                }
                array[index] = element;
            }
            System.out.print("Mang la: ");
            System.out.println(Arrays.toString(array));
            System.out.println("ban muon tiep tuc chen khong?" +
                    "\n1.Co" +
                    "\n2.Khong");
            int choice = input.nextInt();
            if (choice == 2) {
                break;
            }
        }
    }
}
