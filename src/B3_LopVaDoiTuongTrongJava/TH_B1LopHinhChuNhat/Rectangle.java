package B3_LopVaDoiTuongTrongJava.TH_B1LopHinhChuNhat;

import B1_NgonNguLapTrinhJava.BT_B5HienThiCacLoaiHinh.BT_B5HienThiCacLoaiHinh;

public class Rectangle {
    int height, width;

    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getArea() {
        return this.height * this.width;
    }

    public int getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public void display() {
         BT_B5HienThiCacLoaiHinh.rectangle(this.height, this.width);
    }
}
