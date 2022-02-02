import java.io.*;

public class StringCompression {
    static String compressed(String s){
        StringBuilder builder = new StringBuilder();
        int[] ascii = new int[256];
        s = s+"\n";

        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)!=s.charAt(i+1) || s.charAt(i+1)=='\n'){
                builder.append(s.charAt(i));
                builder.append(ascii[s.charAt(i)]+1);
                ascii[s.charAt(i)]=0;
            }
            else ascii[s.charAt(i)]++;
        }

        return builder.toString();
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(compressed(s));
    }
}
