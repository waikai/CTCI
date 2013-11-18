public static void dele(LinkedlistNode n){
    Hashtable table = new Hashtable();
    LinkedlistNode previous = null;
    while(n! =null){
    
            if(table.containsKey(n.data)) previous.next = n.next;
            else{
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }
public static void dele(LinkedListNode n){
    Hashtable table = new Hashtable();
    LinkedListNode previous = null;
    while(n!=null){
        if(table.containKey(n.data)) previous.next = n.next;
        else{
            table.put(n.data, true);
            previous = n;
        }
        n = n.next;
    }
}
public static void dele(LinkedListNode n){
    Hashtable  table = new  Hashtable();
    LinkedListNode previous = null;
    while(!n = null){
        if(table.containKey(n.data)) previous.next = n.next;
        else{
            table.put(n.data,true);
            previous = n;
        }
        n = n.next;
    }
}


public static void dele(LinkedListNode n){
    Hashtable table = new Hashtable();
    LinkedListNode x = null;
 while (n!=null){
    if(table.containKey.(n.data)) {x.next=n.next;}
    else{
        table.put(n.data, true);
    }
    n = n.next;
}
}


public static del(LinkedListNode n){
    Hashtable table = new Hashtable();
    LinkedListNode x = null;
    if(table.contiansKey(n.data)){
        x.next = n.next;
    }else{
        table.put(n.data, true);
        
    }
    n=n.next
}








////withput a buffer
public static void dele2(LinkedListNode head){
    if(head = null ) return;
    LinkedListNode previous = head;
    LinkedListNode current = previous.next;
    while (current != null){
        LinkedListNode runner = head;
        while(runner != current){
            if(runner.data == current.data){
                LinkedListNode tmp = current.next;
                previous.next = tmp;
                current = tmp;
                break;
            }
            runner = runner.next;
        }
        if (runner == current){
            previous = current;
            current = corrent.next;
        }
    }
}


