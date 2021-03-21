import java.util.*;
import java.io.*;


public class FindTheMajorityElements {

    public static void main (String[] args) throws java.lang.Exception
	{
        try{
            FastReader sr = new FastReader();
                
            int n = sr.nextInt();
            int[] arr = new int[n];
            int element1 = 0, element2 = 0, count1 = 0, count2 = 0;
            int m = n/3;


            for(int i=0; i<n; i++){
                arr[i] = sr.nextInt();
                if(arr[i] == element1){
                    count1++;
                }else if(arr[i] == element2){
                    count2++;
                }else if(count1 == 0){
                    element1 = arr[i];
                }else if(count2 == 0){
                    element2 = arr[i];
                }else{
                    count1--;
                    count2--;
                }
            }

            count1 = count2 = 0;
            for(int i=0; i<n; i++){
                if(arr[i] == element1){
                    count1++;
                }else if(arr[i] == element2){
                    count2++;
                }
            }
            
            if(count1 > m){
                System.out.print(element1 + " ");
            }
            if(count2 > m){
                System.out.print(element2);
            }
            if(count1 <= m && count2 <= m){
                System.out.println("No Majority Elements");
            }


        }catch(Exception e){
            System.out.print(e.toString());
        }
    }


    static class FastReader{
        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while (st == null || !st.hasMoreElements())
            {
                try{
                    st = new StringTokenizer(br.readLine());
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str = "";
            try{
                str = br.readLine();
            }catch (IOException e){
                e.printStackTrace();
            }
            return str;
        }
    }

}
