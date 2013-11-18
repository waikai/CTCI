public static TreeNode asstotree(int arr[], int start, int end){
    if(end < start){
        return null ;
    }

    int mid = (start + end)/2;
    TreeNode n = new TreeNode(arr[mid]);
    n.left = addToTree(arr, start, mid -1);
    n.right = addToTree(arr, mid+1 , end);
}
public static TreeNode createMinBST(int array[]){
    return  addToTree(array, 0 , array.length-1);
}




public static TreeNode asstotree(int arr[]. int start, int end){
    if(end < start){
        return null ;
    }
    int mid = (start+end0)/2;
    TreeNode n = new TreeNode(arr[mid]);
    n.left = addToTree(arr, start, mid-1);
    n.right = addToTree(arr, mid+1, end);
}
public static TreeNode min[int arr[], int start, int end]{
    return addToTree(array, 0 , array.length -1);
}







public static TreeNode add(int arr[], int start, int end){
    if(end < start){
        return null;
    }
    int mid = (start+ end)/2;
    TreeNode n = new TreeNode(arr[mid]);
    n.left = add(arr, start, mid-1);
    n.right = add(arr, mid+1, end);
    return n;
}
public static TreeNode creat(int array[]){
    return add(array, 0, array.length-1);
}













