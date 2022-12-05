/*
public class baekjoon_2576 {

    public static void main(String[] args) {

        FastReader fr=new FastReader();

        int arr[] = new int[5];
        int arrSum = 0;

        for(int i=0; i<5; i++){
            arr[i] = fr.nextInt();
            arrSum = arrSum + arr[i];
        }
        Arrays.sort(arr);

        System.out.println(arrSum/arr.length);
        System.out.println(arr[2]);

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
*/
