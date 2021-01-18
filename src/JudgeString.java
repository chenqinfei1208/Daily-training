import java.util.*;
public class JudgeString {
        public boolean[] chkSubStr(String[] p, int n, String s) {
            // write code here
            boolean[] str = new boolean[n];  //默认全是false
            for(int i =0;i<n;i++){
                if(s.contains(p[i])){
                    str[i] = true;
                }
            }
            return str;
        }
    }

