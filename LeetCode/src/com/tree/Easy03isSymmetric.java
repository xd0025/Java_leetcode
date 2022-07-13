package com.tree;

import java.util.LinkedList;
import java.util.Queue;

public class Easy03isSymmetric {
    public boolean isSymmetric(TreeNode root){
        return check(root,root);
    }
    //递归
    public boolean check(TreeNode p,TreeNode q){
        if (p==null&&q==null){
            return true;
        }
        if (p==null||q==null){
            return false;
        }
        return p.val==q.val&&check(p.left,q.right)&&check(p.right,q.left);
    }
    //迭代
    public boolean check01(TreeNode p,TreeNode q){
        Queue<TreeNode> tmp = new LinkedList<TreeNode>();
        tmp.offer(p);
        tmp.offer(q);
        while (!tmp.isEmpty()){
            p = tmp.poll();
            q = tmp.poll();
            if (p ==null&&q==null){
                continue;
            }
            if (p==null||q==null||p.val!=q.val){
                return false;
            }
            tmp.offer(p.left);
            tmp.offer(q.right);

            tmp.offer(p.right);
            tmp.offer(q.left);
        }
        return true;
    }
}
