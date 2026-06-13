import java.util.*;

public class Maxele {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];

        int max = arr[0];

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
