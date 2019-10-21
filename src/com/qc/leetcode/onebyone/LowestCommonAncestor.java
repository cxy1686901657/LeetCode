package com.qc.leetcode.onebyone;

/**
 * @author qc
 * @date 2019/10/20
 * @description
 *
 * 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉树:  root = [3,5,1,6,2,0,8,null,null,7,4]
 *
 *
 *
 *  
 *
 * 示例 1:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
 * 输出: 3
 * 解释: 节点 5 和节点 1 的最近公共祖先是节点 3。
 * 示例 2:
 *
 * 输入: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
 * 输出: 5
 * 解释: 节点 5 和节点 4 的最近公共祖先是节点 5。因为根据定义最近公共祖先节点可以为节点本身。
 *  
 *
 * 说明:
 *
 * 所有节点的值都是唯一的。
 * p、q 为不同节点且均存在于给定的二叉树中。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 *  通过递归左右子树找到pq相等的结点并记录root和回溯。
 *
 * @project LeetCode
 */

public class LowestCommonAncestor {

    public static void main(String[] args){
        TreeNode head = new TreeNode(3);
        TreeNode f = new TreeNode(5);
        TreeNode r = new TreeNode(1);
        TreeNode ff = new TreeNode(6);
        TreeNode fr = new TreeNode(2);
        TreeNode frf = new TreeNode(7);
        TreeNode frr = new TreeNode(4);
        TreeNode rf = new TreeNode(0);
        TreeNode rr = new TreeNode(8);
        head.left=f;
        head.left.left=ff;
        head.left.right=fr;
        head.left.right.left=frf;
        head.left.right.right=frr;
        head.right=r;
        head.right.right=rr;
        head.right.left=rf;
        TreeNode treeNode = lowestCommonAncestor(head, frf, frr);
//        System.out.println(treeNode.val);
        head.preOrder(head);
    }
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {//当遍历到叶结点后就会返回null
            return root;
        }
        if (root == p || root == q) {//当找到p或者q的是时候就会返回pq
            return root;/*当然，值得一提的是，如果公共祖先是自己（pq），并不需要寻找另外
                     一个，我们在执行前序遍历会先找上面的，后找下面的，我们会直接返回公共祖先。*/
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);//返回的结点进行保存，可能是null
        TreeNode right = lowestCommonAncestor(root.right, p, q);//也可能是pq，还可能是公共祖先
        if (left != null && right != null) {
            return root;//如果左右都存在，就说明pq都出现了，这就是，公共祖先，此时不用考虑公共祖先是自己的情况，因为上面已经做过判断了。
        } else if (left != null) {//否则我们返回已经找到的那个值（存储在left，与right中），p或者q
            return left;//还有一种可能就是，由下面返回的公共祖先，并将这个值一路返回到最表层
        } else if (right != null) {
            return right;
        }
        return null;
    }
}
 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }

     @Override
     public String toString() {
         return "TreeNode{" +
                 "val=" + val +
                 '}';
     }
     public void preOrder(TreeNode treeNode){
          if(treeNode==null){
              return;

          }
          this.preOrder(treeNode.left);

         this.preOrder(treeNode.right);
         System.out.println(treeNode.val);
     }
 }