package B6_CauTrucDuLieuVaGiaiThuatDonGian.BT_B2TrienKhaiCacLopTrongThuVienJavaUtilLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {

        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst("a");
        myLinkedList.addFirst("1");
        myLinkedList.add(1, "c");
        myLinkedList.addLast("last");
        myLinkedList.addLast("b");
        myLinkedList.printList();
        System.out.println("============");
        System.out.println("xoa " + myLinkedList.remove(0));
        myLinkedList.printList();
        System.out.println("======");
//        MyLinkedList myLinkedList1 = myLinkedList.clone();
//        myLinkedList1.printList();
//        myLinkedList1.addLast("bb");
//        myLinkedList1.printList();
        myLinkedList.remove("c");
        myLinkedList.printList();
        System.out.println(myLinkedList.indexOf("a"));


    }
}
