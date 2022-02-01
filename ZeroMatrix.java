import java.io.*;
import java.util.Arrays;

public class ZeroMatrix {
    static int[][] zeroMatrix(int[][] a){
        boolean[] rows = new boolean[a.length];
        boolean[] columns = new boolean[a[0].length];
        
        for(int i=0; i<a.length; i++){
            
            for(int j=0; j<a[0].length; j++){
                if(a[i][j]==0){
                    rows[i]=true;
                    columns[j]=true;
                }
            }
        }

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[0].length; j++){
                if(rows[i] || columns[j]){
                    a[i][j]=0;
                }
            }
        }

        return a;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        
        int[][] a = new int[m][n];

        for(int i=0; i<m; i++){
            String row = br.readLine();
            for(int j=0; j<n; j++){
                a[i][j] = Integer.parseInt(row.split(" ")[j]);
            }
        }

        System.out.println(Arrays.deepToString(zeroMatrix(a)));
    }
}
