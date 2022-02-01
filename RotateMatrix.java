import java.io.*;
import java.util.*;

public class RotateMatrix {
    static int[][] rotateMatrix(int[][] a){
        int[][] b = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                b[j][a.length-1-i]=a[i][j];
            }
        }

        return b;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = Integer.parseInt(br.readLine());
            }
        }
        System.out.print(Arrays.deepToString(rotateMatrix(a)));
        }
}