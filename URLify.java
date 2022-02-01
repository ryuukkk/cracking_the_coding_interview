import java.io.*;

public class URLify{
    static String urlify(String s){
        String[] list = s.trim().split(" ");
        return String.join("%20", list);
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.print(urlify(s));
    }
}