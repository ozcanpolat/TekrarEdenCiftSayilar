import java.util.Arrays;

public class Main {
    static boolean isFind(int arr[], int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 8, 15, 25, 30, 30, 24, 48, 48};
        int[] number = new int[list.length];
        int starIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j && list[i] == list[j] && list[i] % 2 == 0) {
                    if (!isFind(number, list[i])) {
                        number[starIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int i : number) {
            if (i != 0) {
                System.out.println(i);
            }
        }
    }
}