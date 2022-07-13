package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Easy02sametree {
    //深度优先搜索,递归，其实是在用栈
    public boolean isSameTree(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }else if (p==null ||q==null){
            return false;
        }else if(p.val!=q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }
    }
    //广度优先搜索，队列
    public boolean isSameTree01(TreeNode p,TreeNode q){
        Queue<TreeNode> tmp = new LinkedList<TreeNode>();
        tmp.offer(p);
        tmp.offer(q);
        while (!tmp.isEmpty()){
            p = tmp.poll();
            q = tmp.poll();
            if(p == null && q == null){
                continue;
            }
            if (p == null||q == null||p.val!=q.val){
                return false;
            }
            tmp.offer(p.left);
            tmp.offer(q.left);

            tmp.offer(p.right);
            tmp.offer(q.right);
        }
        return true;
    }
}
