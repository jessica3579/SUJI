import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();

        int h, m, h_r, m_r, i=0, j=0;
        h = c / 60;
        m = c % 60;

        h_r = a + h;
        m_r = b + m;

        if(m_r >= 60){
            i = m_r / 60;
            j = m_r % 60;
            m_r = j;
        }
        h_r += i;

        if(h_r >= 24){
            h_r %= 24;
        }
        System.out.println(h_r + " " + m_r);
    }
}