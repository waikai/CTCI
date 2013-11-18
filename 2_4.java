

class{

LinkedListNode addList(LinkedListNode l1, LinkedListNode l2, int carry){
    if (l1 == null && l2 ==null){
        return null;
    }
    LinkedListNode result = new LinkedListNode(carry, null ,null);
    int value = carry;
    if(l1 != null){
        value += l1.data;
    }
    if(l2 != null){
        value += l2.data;
    }

    result.data = value % 10 ;
    LinkedListNode more = addList(l1 == null ? null : l1.next,
                                    l2 == null ? null : l2.next,
                                    value > 10 ? 1:0);
    result.setNext(more);
    return result;
}

public static void main(Str)


}



