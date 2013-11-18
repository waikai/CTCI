LinkedListNode find(LinkedListNode head. int n){
    if(head == null||n<1){
        return null;
    }
    LinkedListNode p1 = head;
    LinkedListNode p2 = head;
    for(int j = 0, j < n-1; ++j){
        if(p2 == null){
            return null;
        }
        p2=p2.next;
    }
    while (p2.next != null){
        p1 = p1.next;
        p2 = p2.next;
    }
    return p1;
}


LinkedListNode find(LinkedListNode head, int n){
    if(head == null || n <1){
        return null;
    }
    LinkedListNode p1 =head;
    LinkedListNode p2 =head;
    for(int j =0; j<n-1; ++j){
        if(p2 == null){
            return null;
        }
        p2 = p2.next;
    }
    while (p2 != null){
        p2  = p2.next;
        p1 = p1.next;
    }
    return p1;
}



































