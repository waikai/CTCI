public class SetOfStack{
    ArrayList<Stack> stack = new ArrayList<Stack>();
    public int capacity;
    public SetOfStacks(int capacity) {
        this.capacity = capacity;
    }

    public Stack getLastStack() {
        if (stacks.size()==0) return null;
        return stacks.get(stack.size()-1);
    }

    public void push(int v){
        Stack last = getLastStack();
        if (last!= null && !last.isATCapacity()){
            last.push(v);
        }else{
            Stack stack = new Stack(capacity);
            stack.push(v);
            stacks.add(stack);
        }
    }
    public int pop() {
        Stack last = getLastStack();
        System.out.println(stacks.size());
        int v = last.pop();
        if (last.size == 0 ) stack.remove(stacks.size()-1);
        return v;
    }
    public int popAT(int index){
        return leftShift(index,ture);
    }
    public int leftShift(int index, boolean removeTop){
        Stack stack = stack.get(index);
        int removed_item;
        if (removeTop) removed_item = stack.pop();
        else removed_item = stack.removeBottom();
        if (stack.isEmpty()){
            stack.remove(index);
        }else if (stack.size()>index+1){
            int v = leftShift(index+1,false);
            stack.push(v);
        }
        return removed_item;
    }
}



public class Stack{
    private int capacity;
    public Node top, bottom;
    public int size = 0;

    public Stack(int capacity){ this.capacity= capacity;}
    public boolean isATCapacity() {return capacity == size;}
    public void join(Node above, Node below){
        if (below != null ) below.above=above;
        if (above != null ) above.below = below;}
    public boolean push(int v){
        if (size >= capacity) return false;
        size++;
        Node n = new Node(v);
        if (size ==1 ) bottom = n;
        join (n, top);
        top = n;
        return true;
    }
    public int pop(){
        Node t = top;
        top = top.below;
        size--;
        return t.value;
    }
    public boolean isEmpty() { return size == 0;}
    public int removeBottom(){
        Node b = bottom;
        bottom = bottom.above;
        if (bottom !=null) bottom.below =null ;
        size--;
        return b.below;
    }
}




