import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ball = sc.nextInt();
        int num = sc.nextInt();
        int[] ball_array =new int[ball+1];
        int count=0, temp, a,b;

        for(int i=1; i<ball+1; i++){
            ball_array[i]=i;
        }

        while(true){
            a = sc.nextInt();
            b = sc.nextInt();

            temp = ball_array[a];
            ball_array[a] = ball_array[b];
            ball_array[b] = temp;

            count++;
            if(count == num) break;
        }

        for(int i=1; i<ball+1; i++){
            System.out.print(ball_array[i] + " ");
        }
    }
}