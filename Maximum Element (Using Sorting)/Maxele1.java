import java.util.*;

public class Maxele1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];


        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();

        }
        Arrays.sort(arr);
        System.out.println(arr[size - 1]);
    }
}
