import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        double max=0, sum=0;
        double[] grades = new double[num];
        for(int i =0; i<num; i++) {
            grades[i] = sc.nextInt();
            if(max<grades[i]) max = grades[i];
        }
        for(int i=0; i<num; i++){
            grades[i] = grades[i]/max*100;
            sum += grades[i];
        }
        System.out.println(sum/num);
    }
}