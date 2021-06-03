/*
 * @lc app=leetcode.cn id=2 lang=java
 *
 * [2] 两数相加
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      ListNode l=new ListNode();
      int count = 0;
      if(l1.val==0||l2.val==0){return l1.val==0?l2:l1;}
      while(l1!=null&&l2!=null){
      if(l1.val+l2.val>=10){
        l.val=l1.val+count+l2.val-10;
        if(count!=0){count--;}
        count++;
        l1=l1.next;
        l2=l2.next;
        l=l.next;
      }else{
        l.val = l1.val + count + l2.val;
        if(count!=0){count--;}
        l1=l1.next;
        l2=l2.next;
        l=l.next;
      }
    }
      while(l1!=null){
        if(l1.val+count>=10){
          l.val=l1.val+count-10;
          if(count!=0){count--;}
          count++;
          l1=l1.next;
          l=l.next;
        }else{
          l.val = l1.val + count;
          if(count!=0){count--;}
          l1=l1.next;
          l=l.next;
        }
      }
      while(l2!=null){
        if(l2.val+count>=10){
          l.val=l2.val+count-10;
          if(count!=0){count--;}
          count++;
          l2=l2.next;
          l=l.next;
        }else{
          l.val = l2.val + count;
          if(count!=0){count--;}
          l2=l2.next;
          l=l.next;
        }
        l.val=l2.val;
        l2 = l2.next; 
        l = l.next;
      }
      if(count!=0){
        final ListNode l0 = new ListNode(1);
        l.next=l0;
      }
    return l;
  }
}
// @lc code=end

