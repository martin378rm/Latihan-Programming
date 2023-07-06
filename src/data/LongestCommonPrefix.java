package data;

import java.lang.String;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String [] strs = {"folower","flow","flight"};

//        System.out.println(longestCommon(strs));

        
    }

    private static String longestCommon(String[] s){

        // jika array kosong return string kosong
        if (s.length == 0){
            return "";
        }
        // ambil index pertama menjadi awalan string
        String prefix = s[0];

        // lakukan iterasi untuk pengecekan
        for (int i = 1; i  < s.length; i++){
            String str = s[i];
            while (str.indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
