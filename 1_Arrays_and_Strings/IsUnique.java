import java.io.*;

public class IsUnique {
    static boolean isUnique(String s){
        if(s.length()>256) return false;
        
        boolean[] ascii = new boolean[256];

        for(int i=0; i<s.length(); i++){
            if(ascii[s.charAt(i)]) return false;
            ascii[s.charAt(i)]=true;
        }
        return true;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(isUnique(s));
        }
}
