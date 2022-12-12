/*
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//메인 클래스
public class Main {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        long a = fr.nextLong();
        long b = fr.nextLong();

        if(a>b) {
            System.out.println(a-b-1);
            for(long i=b+1;i<a;i++) {
                System.out.print(i+" ");
            }
        }
        if(b>a) {
            System.out.println(b-a-1);
            for(long i=a+1;i<b;i++) {
                System.out.print(i+" ");
            }
        }
        if(a==b) {
            System.out.println(0);
        }

    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}*/
