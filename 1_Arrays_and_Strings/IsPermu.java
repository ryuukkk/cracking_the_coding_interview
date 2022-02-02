//Check if a string s is a permutation of another string t.
//Enter two strings in two lines.

//Solution Logic: Simply count the number of occurences of each character in both strings.
//If the character count is same and both strings are equal in length, then they are permutations of each other.
//Note : No need to find all permutations of one string, that would needlessly increase complexity.

import java.io.*;

public class IsPermu{
    static boolean isPermu(String s, String t){
        int[] counts = new int[256];

        for(int i=0; i<s.length(); i++){
            counts[s.charAt(i)]++;
        }
        for(int i=0; i<t.length(); i++){
            counts[t.charAt(i)]--;
            if(counts[t.charAt(i)]<0) return false;
        }
        for(int i:counts) if(i>0) return false;
        
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();
        System.out.println(isPermu(s, t));
    }
}