public Tree commonAncsdtor(Tree root, Tree p, Tree q){
    if(covers(root.left,p) && covers(root.left, q))
        return commonAncsdtor(root.left, p, q);
    if(covers(root.right, p) && covers(root.right, q))
        return commonAncsdtor(root.right, p , q);
    return root;
}
private boolean covers(Tree root, Tree p){
    if(root == null ) return false;
    if (root == p) return true;
    return covers(root.left, p) || covers(root.right, p);
}



public Tree commonAncsdtor(Tree root, Tree p, Tree q){
    if(covers(root.left, p) && covers(root.left, q))
        return commonAncsdtor(root.left, p , q);
    if(covers(root.right, p) && covers(root.right, q))
        return commonAncsdtor(root.right, p, q);
    return root;
}
private boolean covers(Tree root, Tree p){
    if(root == null ) return false;
    if (root == p) return true;
    return covers(root.left, p) || covers(root.right, p);
}

