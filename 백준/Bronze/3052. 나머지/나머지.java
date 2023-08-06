import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] rest_array = new int[42];
        int[] num_array = new int[10];
        int n, count=0;
        Arrays.fill(rest_array, 0);

        for(int i=0; i<10; i++){
            num_array[i] = sc.nextInt();
            n = num_array[i] % 42;
            rest_array[n] = 1;
        }
        for(int i=0; i<42; i++){
            if(rest_array[i] ==1) count ++;
        }
        System.out.println(count);
    }
}