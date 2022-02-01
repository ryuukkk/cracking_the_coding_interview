import java.util.*;
import java.io.*;

public class RotateMatrix {
    static int[][] rotateMatrix(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = br.read();
        int arr[][] = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = br.read();
            }
        }
        System.out.print(rotateMatrix(arr));
        }
}
