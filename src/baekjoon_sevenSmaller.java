import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
/*

//메인 클래스
public class Main {

    public static void main(String[] args) {

        FastReader fr = new FastReader();

        int arr[] = new int[9];
        List<Integer> detectArr = new ArrayList<Integer>();
        int arrSum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = fr.nextInt();

        }

        for(int p = 0; p < 7; p++){
            arrSum = arrSum + arr[p];
            detectArr.add(arr[p]);
        }
        if (arrSum == 100) {
            Collections.sort(detectArr);
            System.out.println(detectArr);
        } else {
            arrSum = 0;
            detectArr.clear();
            for (int j = 1; j < 8; j++) {
                arrSum = arrSum + arr[j];
                detectArr.add(arr[j]);
            }
            if (arrSum == 100) {
                Collections.sort(detectArr);
                System.out.println(detectArr);
            } else {
                arrSum = 0;
                detectArr.clear();
                for (int k = 2; k < 9; k++) {
                    arrSum = arrSum + arr[k];
                    detectArr.add(arr[k]);
                    if (arrSum == 100) {
                        Collections.sort(detectArr);
                        System.out.println(detectArr);
                    }
                }
            }
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
