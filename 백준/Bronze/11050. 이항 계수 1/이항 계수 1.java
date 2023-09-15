import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();

        int result, p1=1, p2=1, p3=1;

        for(int i=1; i<=n; i++) {
            p1 *= i;
        }
        for(int i=1; i<=r; i++) {
            p2 *= i;
        }
        for(int i=1; i<=(n-r); i++) {
            p3 *= i;
        }
        result = p1 / (p2*p3) ;
        System.out.println(result);
    }
}