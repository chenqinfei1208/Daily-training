import java.util.ArrayList;
import java.util.Collections;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 */

//方法一：递归调用
public class ExchangeArrayList {
    public class ListNode {
        int val;
         ListNode next = null;

         ListNode(int val) {
            this.val = val;
        }
    }
    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode){
            ArrayList<Integer> list = new ArrayList<Integer>();
            while(listNode != null){
                list.add(listNode.val);
                listNode = listNode.next;
            }
            Collections.reverse(list);
            return list;

        }
    }
}
/**方法二：头插法
import java.util.ArrayList
 public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(listNode != null) {
            list.add(0, listNode.val);
            listNode = listNode.next;
        }
        return list;
    }
}
 //方法三：用栈实现
 import java.util.ArrayList;
public class Solution类 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        ListNode temp = listNode;//这里需要构造一个ListNode类
        while ( temp != null ) {//需要先判断链表时候为空
            list.add( temp.val );//定义节点
            temp = temp.next;
        }
        for ( int i = list.size()-1; i>=0; i-- ) {
            result.add( list.get(i) );//遍历获得一个 ArrayList链表输出。
        }
        return result;
    }
}

 **/

