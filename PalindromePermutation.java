import java.util.*;
import java.io.*;

public class PalindromePermutation{
    static boolean palindromePermution(String s){
        int count=0;
        int[] ascii = new int[256];
        s = s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!=' ') ascii[s.charAt(i)]++;
        }

        for(int i:ascii){
            if(i%2!=0) count++;
            if(count>=2) return false;
        }

        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(palindromePermution(s));
    }
}