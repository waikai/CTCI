public static boolean deleteNode(LinkedLinstNode n){
    if( n == null || n.next == null){
        return false;
    }
    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
}
















public static boolean del(LinkedListNode n){
    if(n == null || n.next == null){
        return null;
    }
    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
}



public static boolean del(LinkedListNode n){
    if (n == null || n.next == null ){
        return false ;
    }
    LinkedListNode next = n.next;
    n.data = next.data;
    n.next = next.next;
    return true;
}

