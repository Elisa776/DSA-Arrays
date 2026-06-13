import java.util.HashSet;
import java.util.Scanner;

public class Remd1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
            set.add(arr[i]);
        }
        System.out.println(set);
    }
}
