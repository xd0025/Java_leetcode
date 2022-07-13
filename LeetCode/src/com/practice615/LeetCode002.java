package com.practice615;

public class LeetCode002 {
    public ListNode twosumadd(ListNode l1,ListNode l2){
        ListNode root = new ListNode(0);
        ListNode cursor = root;
        int carry = 0;
        while (l1 !=null||l2 != null||carry!=0){
            int l1val = l1!=null?l1.val:0;
            int l2val = l2!=null?l2.val:0;
            int sumval = l1val+l2val+carry;
            carry = sumval/10;
            ListNode num =new ListNode(sumval%10);
            cursor.next =num;
            cursor = num;

            if (l1!=null)l1 = l1.next;
            if (l2!=null)l2 = l2.next;
        }
        return root.next;
    }
}

