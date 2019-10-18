package B2_MangVaPhuongThucTrongJava.BT_B6DemSoLanXuatHienTrongChuoi;

import java.util.Scanner;

public class BT_B6DemSoLanXuatHienTrongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "doan ngoc linh";
        System.out.println("nhap ky tu muon kiem tra");
        String kyTu = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == kyTu.charAt(0)) {
                count++;
            }
        }
        System.out.println("ky tu " + kyTu + "xuat hien " + count + " lan");
    }
}
