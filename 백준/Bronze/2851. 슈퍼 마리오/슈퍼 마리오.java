import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = 10, sum=0, count=0, sum_1=0;
        int[] num;
        num = new int[n];

        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }
        while(true){
            if(count<n) {
                sum += num[count];
                if (sum >= 100) {
                    sum_1 = sum - num[count];
                    break;
                }

                count++;
            }else{
                break;
            }
        }
        if(sum -100 > 100 -(sum_1)) System.out.println(sum_1);
        else if(sum - 100 < 100 -(sum_1)) System.out.println(sum);
        else System.out.println(sum);
    }
}
