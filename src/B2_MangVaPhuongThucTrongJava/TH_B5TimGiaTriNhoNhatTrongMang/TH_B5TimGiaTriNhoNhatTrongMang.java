package B2_MangVaPhuongThucTrongJava.TH_B5TimGiaTriNhoNhatTrongMang;

public class TH_B5TimGiaTriNhoNhatTrongMang {
    private static String timGiaTriNhoNhat(int[] arr) {
        int min = arr[0];
        String total = "";
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            total = "gia tri lon nhat la: " + min + " o vi tri " + i;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] array = {2, 5, 8, 1, 8, 0, 6, 4, 100, -4};
        System.out.println(timGiaTriNhoNhat(array));
    }
}
