import java.util.LinkedHashSet;
import java.util.Scanner;

public class Remd2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(s.nextInt());
        }
        System.out.println(set);
    }
}
