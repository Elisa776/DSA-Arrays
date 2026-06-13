import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Rotr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Integer[] arr = new Integer[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int k = s.nextInt();
        Collections.rotate(Arrays.asList(arr), k);
        System.out.println(Arrays.toString(arr));
    }
}
