public static TreeNode inord(TreeNode e){
    if(e != null){
        TreeNode p;
        TreeNode r;
        if(e.parent == null || e.right != null){
                r = e.right;
                while(r.left != null){
                    r = r.left;
                }
                p = r;
        }else{
            while ((p = e.parent) != null){
                if ( p.left == e){
                    break;
                }
                e = p;//对p再找
            }
        }
        return p;
    }
    return null;
}

