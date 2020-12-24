/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
//方法一
import java.util.Scanner;
public class Replace {
    //StringBuffer
    public static String MyReplace(StringBuffer str) {
        //得到数组长度
        int length = str.length();
        //new一个nullspace统计空格数
        int nullspace = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                nullspace++;
            }
        }
        //新数组长度=原数组长度+2*空格数（因为由原来的' '变为%02
        int newlength = length + nullspace * 2;

        //setLength
        str.setLength(newlength);
        for (int j = newlength - 1; j >= 0; j--) {
            if (str.charAt(j) != ' ') {
                //
                str.setCharAt(newlength--, '2');
                str.setCharAt(newlength--, '0');
                str.setCharAt(newlength--, '%');
            } else {
                str.setCharAt(newlength--, str.charAt(j));
            }
        }
           //
         return str.toString();
    }

//方法二
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        if(str==null)
            return s;
        //
        char[] ss=s.toCharArray();
        //
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<ss.length;i++)
        {
            if(ss[i]==' ')
            {
                //
                sb.append("%20");
            }
            else
                sb.append(ss[i]);
        }
        //
        return sb.toString();
    }
}
