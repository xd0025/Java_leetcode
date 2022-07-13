package com.practice;

public class SumAdd {
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
        ListNode head =new ListNode(0);
        public void add(ListNode listNode) {

            //因为head节点不能动，因此我们需要一个辅助遍历 temp
            ListNode temp = head;
            //遍历链表，找到最后
            while(true) {
                //找到链表的最后
                if(temp.next == null) {//
                    break;
                }
                //如果没有找到最后, 将将temp后移
                temp = temp.next;
            }
            //当退出while循环时，temp就指向了链表的最后
            //将最后这个节点的next 指向 新的节点
            temp.next = listNode;
        }
    }
    public ListNode addTwoNum(ListNode l1,ListNode l2){
        ListNode root = new ListNode(0);
        ListNode cursor =root;
        int carry=0;
        while (l1!=null||l2!=null||carry!=0){
            int l1val=l1!=null?l1.val:0;
            int l2val=l2!=null?l2.val:0;
            int sumval = l1val+l2val+carry;
            carry =sumval/10;

            ListNode sumNode =new ListNode(sumval%10);
            cursor.next=sumNode;
            cursor =sumNode;

            if(l1!=null) l1=l1.next;
            if (l2!=null) l2=l2.next;
        }
        return root.next;
    }

}
