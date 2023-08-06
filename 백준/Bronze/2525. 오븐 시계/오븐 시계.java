import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int need = Integer.parseInt(br.readLine());
        
        if(m+need<60){
            m = m+need;
            bw.write(h+" "+m);
        }else{
            if(h+(m+need)/60<24) {
                h = h + (m + need) / 60;
                m = (m + need) % 60;
                bw.write(h + " " + m);
            }else {
                h = (h+(m+need)/60)%24;
                m = (m + need) % 60;
                bw.write(h + " " + m);
            }
        }
        bw.close();
    }
}