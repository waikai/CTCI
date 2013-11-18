public class Myqueue<T> {
    Stack<T> s1,s2;
    public Myqueue() {
        s1 = new Stack<T>();
        s2 = new stack<T>();
    }

    public int size(){
        return s1.size()+s2.size();
    }
     public T push(T value) {
         s1.push(value);
     }

     public T peek() {
         if (!s2.empty()) return s2.peek();
         while (!s1.empty()) s2.push(s1.pop());
         return s2.peek():
     }
     public T pop(){
         if (!s2.empty()) return s2.pop();
         while (!s1.empty()) s2.push(s1.pop());
         return s2.pop();
     }
}

public class Myqueue<T> {
    Stack<T> s1,s2;
    public Myqueue{
        Stack<T> s1 = new Stack<T>();
        stack<T> s2 = new Stack<T>();
    }
    public int size(){
        return size(s1)+size(s2);
    }
    public T push(value){
        s1.push(value);
    }
    public T pop() {
        if(!s2.isEmpty()) s2.pop();
        while(!s1.isEmpty()) s2.push(s1.pop());
        return s2.pop()}

