import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class baekjoon_2576 {
    public static void main(String[] args) {
        Main.FastReader fr=new Main.FastReader();

        int input[] = new int[7];
        List<Integer> singleArr = new ArrayList<Integer>();
        int singleSum = 0; // 홀수 총합
        int smallSingle = 0;

        for(int i=0; i<7; i++){
            input[i] = fr.nextInt();
            if(input[i]%2 == 1){
                singleSum = singleSum + input[i];

                singleArr.add(input[i]);
            }

            Collections.sort(singleArr);
        }
        if(!(singleSum==0)) System.out.println(singleSum);
        else { System.out.println(-1); }
        if(!singleArr.isEmpty()) System.out.println(singleArr.get(0));


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
}
