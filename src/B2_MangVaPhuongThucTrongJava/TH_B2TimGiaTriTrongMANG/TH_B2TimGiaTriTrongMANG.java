package B2_MangVaPhuongThucTrongJava.TH_B2TimGiaTriTrongMANG;

import java.util.Scanner;

public class TH_B2TimGiaTriTrongMANG {
    private static void timViTri(String[] array, String name) {
        String total = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(name)) {
                total = name + " xuat hien trong mang o vi tri: " + i;
                break;
            } else {
                total = name + " khong xuat hien trong mang";
            }
        }
        System.out.println(total);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] student = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.println("nhap ten muon kiem tra");
        String inputName = input.nextLine();
        timViTri(student, inputName);
    }
}
