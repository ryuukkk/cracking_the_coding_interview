import java.util.*;
import java.io.*;

public class RotateMatrix {
    static int[][] rotateMatrix(int[][] a){
        int[][] b = new int[a.length][a[0].length];

        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                b[j][a.length-i]=a[i][j];
            }
        }

        return b;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read();
        int a[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = br.read();
            }
        }
        System.out.print(rotateMatrix(a));
        }
}