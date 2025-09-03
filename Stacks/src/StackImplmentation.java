import java.util.ArrayList;
public class StackImplmentation {
    static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        Node top=null;

        public void push(int data)
        {
            Node node = new Node(data);
            if(top==null)
            {
                top=node;
            }
            else{
                node.next=top;
                top=node;
            }
        }
        public int pop()
        {
           int ele = top.data;
           top=top.next;
           return ele;
        }
        public boolean isEmpty()
        {
            if(top==null)
            {
                return true;
            }
            return false;
        }

    }
    public  static  void  main(String[] args){
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
