package B6_CauTrucDuLieuVaGiaiThuatDonGian.TH_B1TrienKhaiLopListDonGian;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * tang gap 2 kich thuoc mang
     */
    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    /**
     * them phan tu
     *
     * @param e
     */
    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    /**
     * tra ve phan tu o vi tri i
     *
     * @param i
     * @return
     */
    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i]);
            System.out.print(", ");
        }
        System.out.println("\n");
    }
}
