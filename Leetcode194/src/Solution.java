import java.util.Scanner;

class Solution {
    public int percentageLetter(String s, char letter) {
        int per=0;
            char ch[]=s.toCharArray();
            int count=0;
            for (int i = 0; i < ch.length; i++) {
               if( ch[i]==letter){
                   count++;
               }
            }
            per=count/s.length();

        return per;
    }
}