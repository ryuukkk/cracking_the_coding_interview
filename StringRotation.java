//Check if a string is a rotation of another string. (Eg. terbottlewa and ottlewaterb are rotations of waterbottle.)
//Enter two string separated by a linefeed.

//Solution Logic: to check if "yzx"(say string t) is a rotation of "xyz"(say string s), we just check if "yzx" is a substring of "xyzxyz" (s+s).

import java.io.*;

public class StringRotation{
    static boolean isStringRotation(String s, String t){
        if(s.length()==t.length() && (s+s).contains(t)) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String t = br.readLine();

        System.out.println(isStringRotation(s, t));
    }
}