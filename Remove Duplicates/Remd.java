import java.util.ArrayList;
import java.util.Scanner;

public class Remd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        ArrayList<Integer> freeSizeArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        for (int i = 0; i < size; i++) {
            if (!freeSizeArray.contains(arr[i])) {
                freeSizeArray.add(arr[i]);
            }

        }
        System.out.println(freeSizeArray);
    }
}
