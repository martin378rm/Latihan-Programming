package data;

import java.lang.String;
import java.util.Scanner;

public class LeetCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String kata = scan.nextLine();
//
//        int sum = 0;
//        int ans = 0;
//        for (int i = 0; i < kata.length()-1; i++){
//            if (kata.charAt(i) == 'I'){
//                sum += 1;
//            } else if (kata.charAt(i) == 'V') {
//                sum = 5;
//            } else if (kata.charAt(i) == 'X'){
//                sum = 10;
//            } else if (kata.charAt(i) == 'L'){
//                sum = 50;
//            } else if (kata.charAt(i) == 'C'){
//                sum = 100;
//            } else if (kata.charAt(i) == 'D'){
//                sum = 500;
//            } else if (kata.charAt(i) == 'M'){
//                sum = 1000;
//            }
//            if (4 * sum < ans){
//                ans -= sum;
//            } else{
//                ans += sum;
//            }
//
//        }
//        System.out.println(sum);

        System.out.println(romanToInt("MCMXCIV"));
    }

    private static int leet(String s){
        int answer = 0, sum = 0, prev = 0;
        for (int i = s.length()-1; i >= 0; i-- ){
            switch (s.charAt(i)){
                case 'I' :
                    sum = 1;
                    break;
                case 'V' :
                    sum = 5;
                    break;
                case 'X' :
                    sum = 10;
                    break;
                case 'L' :
                    sum = 50;
                case 'C' :
                    sum = 100;
                    break;
                case 'D' :
                    sum = 500;
                case 'M' :
                    sum = 1000;
                    break;
            }
           if (sum < prev){
               answer -= sum;
           } else {
               answer += sum;
           }
           prev = sum;
        }
        return answer;
    }

    public static int romanToInt(String s) {
        int sum = 0, pre = 0;
        char ch = 0;
        for (int i = 0; i < s.length(); i++) {
            pre = ch;
            ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    sum++;
                    break;
                case 'V':
                    if (pre == 'I')
                        sum = sum + 3;
                    else
                        sum = sum + 5;
                    break;
                case 'X':
                    if (pre == 'I')
                        sum = sum + 8;
                    else
                        sum = sum + 10;
                    break;
                case 'L':
                    if (pre == 'V')
                        sum = sum + 40;
                    if (pre == 'X')
                        sum = sum + 30;
                    else
                        sum = sum + 50;
                    break;
                case 'C':
                    if (pre == 'I')
                        sum = sum + 98;
                    if (pre == 'V')
                        sum = sum + 90;
                    if (pre == 'X')
                        sum = sum + 80;
                    else
                        sum = sum + 100;
                    break;
                case 'D':
                    if (pre == 'V')
                        sum = sum + 490;
                    if (pre == 'X')
                        sum = sum + 480;
                    if (pre == 'L')
                        sum = sum + 400;
                    if (pre == 'C')
                        sum = sum + 300;
                    else
                        sum = sum + 500;
                    break;
                case 'M':
                    if (pre == 'I')
                        sum = sum + 998;
                    if (pre == 'V')
                        sum = sum + 990;
                    if (pre == 'X')
                        sum = sum + 980;
                    if (pre == 'L')
                        sum = sum + 900;
                    if (pre == 'C')
                        sum = sum + 800;
                    else
                        sum = sum + 1000;
                    break;
            }
        }
        return sum;
    }

}
