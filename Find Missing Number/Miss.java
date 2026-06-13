import java.util.Scanner;

public class Miss {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < size - 1; i++) {
            arr[i] = s.nextInt();
        }
        int E = (size * (size + 1)) / 2;
        int A = 0;
        for (int num : arr) {
            A += num;
        }
        System.out.println(E - A);
    }
}
