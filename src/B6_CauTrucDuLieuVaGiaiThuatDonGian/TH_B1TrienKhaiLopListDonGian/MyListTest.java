package B6_CauTrucDuLieuVaGiaiThuatDonGian.TH_B1TrienKhaiLopListDonGian;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(7);
        listInteger.add(8);
        listInteger.add(9);
        listInteger.add(10);
        listInteger.add(10);
        listInteger.hienThi();
        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 7: "+listInteger.get(7));
        System.out.println("element 2: "+listInteger.get(2));
    }
}
