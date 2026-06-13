import java.util.*;

public class Secmax {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int size = s.nextInt();
        int[] arr = new int[size];

        int L = Integer.MIN_VALUE;
        int S = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();

        }
        for ( int i = 0; i < size; i++){
            if( arr[i] > L){
                S = L;
                L = arr[i];
            }
            else if(arr[i] > S && arr[i] != L){
                S = arr[i];
            }
        }
        System.out.println(S);
    }
}
