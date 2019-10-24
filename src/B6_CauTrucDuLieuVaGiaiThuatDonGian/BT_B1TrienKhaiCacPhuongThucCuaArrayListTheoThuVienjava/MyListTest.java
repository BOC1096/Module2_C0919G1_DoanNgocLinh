package B6_CauTrucDuLieuVaGiaiThuatDonGian.BT_B1TrienKhaiCacPhuongThucCuaArrayListTheoThuVienjava;

public class MyListTest {
    public static void main(String[] args) {
        MyList myList = new MyList();
        try {
            myList.add(0, 3);
            myList.add(1, 2);
            myList.add(2, 3);
            myList.add(3, 8);
            myList.add(4);

        } catch (IndexOutOfBoundsException e) {
            System.out.println(e);
        }
        myList.hienThi();
        myList.remove(1);
        System.out.println("======");
        myList.hienThi();
        MyList myList2 = myList.clone();
        System.out.println(myList.indexOf(null));
//        myList2.add(0, 5);
//        myList2.hienThi();

    }
}
