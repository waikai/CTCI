public class StackwithMin extends Stack<Integer>{
    public StackwithMin() {
        s2 = new Stack<Integer>;
    }
    public void push(int value){
        if (value <= min()){
            s2.push(value);
        }
        super.push(value);
    }
    public void pop() {
        int value = super.pop();
        if (value == min()){
            s2.pop();
        }
    }
    public int min(){
        if(s2.isEmpty()){
            return null;
        }
        else {
            return s2.peek();
        }
    }
}

    


