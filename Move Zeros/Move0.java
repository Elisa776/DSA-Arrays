import java.util.ArrayList;
import java.util.Scanner;
public class Move0 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        ArrayList<Integer> Arra = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        int count = 0;
        for (int num : arr) {
            if (num != 0) {
                Arra.add(num);
            } else {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            Arra.add(0);
        }
        System.out.println(Arra);
    }
}
