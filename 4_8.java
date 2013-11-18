void findSum(TreeNode head, int sum, ArrayList<Integer> buffer, int level){
    if (head == null) return;
    int tmp = sum;
    buffer.add(head.data);
    for(int i = level ; i > -1; i--){
        tmp -= buffer.get(i)
