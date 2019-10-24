package B6_CauTrucDuLieuVaGiaiThuatDonGian.TH_B2TrienKhaiLopLinkedListDonGian;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(11);
        ll.add(0, 1);
//        ll.addFirst(10);
//        ll.addFirst(12);
//        ll.addFirst(11);

        ll.add(3, 9);
        ll.add(2, 9);
        ll.printList();
    }
}
