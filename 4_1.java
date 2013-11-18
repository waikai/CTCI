public static int maxDepth(TreeNode root){
    if(root == null){
        return 0;
    }
    return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
}


public static int minDepth(TreeNode root){
    if(root i== null){
        return null ;
    }
    return 1 + Math.min(minDepth(root.left), minDepth(root.right));
}


public boolean isblance(TreeNode root){
    return (maxDepth(root) - minDepth(root)) <= 1;
}



public boolean isB(TreeNode root){
    return determine(root) > 0;
}
    public int determine(TreeNode root){
        if(root == null){
            return 0 ;
        }else{
            int left = determine(root.left);
            int right = determine(root.rigt);
            if(left < 0 || right <0 || Math.abs(left - right) > 1){
                return -1;
            }
            return Math.max(left,right) +1;
        }
    }



