class quad{
    int max ;
    int min ;
    int sum ;
    boolean isBST ;
    quad(int min , int max , int sum,boolean isBST){
        this.min=min;
        this.max=max;
        this.sum=sum;
        this.isBST = isBST;
    }
}
class Solution {
    static int maxsum ;
    public int maxSumBST(TreeNode root) {
        maxsum = 0;
        helper(root);
        return maxsum;
    }
    public static quad helper(TreeNode root){
        if(root==null){
            return new quad(Integer.MAX_VALUE,Integer.MIN_VALUE,0,true);
        }
        quad lst = helper(root.left);
        quad rst = helper(root.right);
        int max = Math.max(root.val,Math.max(lst.max,rst.max));
        int min = Math.min(root.val,Math.min(lst.min,rst.min));
        int sum = root.val + lst.sum + rst.sum ;
        boolean isBST = lst.isBST && rst.isBST && (lst.max<root.val && rst.min>root.val);
        if(isBST==true){
            maxsum = Math.max(sum,maxsum);
        }
        return new quad(min,max,sum,isBST);
    }
}