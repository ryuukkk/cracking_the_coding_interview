//In an MxN matrix, if an element is zero, set its entire row and column to zeros.
//Enter M and N in two separate lines. Third line onwards, enter one row(N elements separated by space) in each line, which goes on for M lines.

//Solution Logic: Take two boolean arrays row and columns, iterate through matrix, if a zero is encountered, flag its row number as true 
//in row array and column number as true in column array. Then set these rows and columns(which are true) to zeros in the matrix.
//Note: Dont just set the row and column to zero as soon as you find a zero while iterating, this would lead to whole matrix being set to zeros.

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
