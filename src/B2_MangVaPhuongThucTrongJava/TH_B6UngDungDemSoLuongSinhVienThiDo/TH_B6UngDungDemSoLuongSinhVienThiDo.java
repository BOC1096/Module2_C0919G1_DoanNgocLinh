package B2_MangVaPhuongThucTrongJava.TH_B6UngDungDemSoLuongSinhVienThiDo;

import java.util.Scanner;

public class TH_B6UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        int size;
        int[] array;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30 || size <= 0)
                System.out.println("Size invalid");
        } while (size > 30);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5) {
                count++;
            }
        }
        System.out.print("\n The number of students passing the exam is " + count);
    }
}
