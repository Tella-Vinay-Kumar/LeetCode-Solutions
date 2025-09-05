import java.util.Stack;
public class StackUsingQueue {

    public static void main(String[] args) {
        queue q = new queue();
        q.add(10);
        q.add(20);
        while(!q.isEmpty())
        {
            System.out.println(q.remove());
        }


    }
    public static class queue{
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        public static void add(int data)
        {
            if(s1.isEmpty()){
                s1.push(data);
            } else {
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
                s1.push(data);
                while(!s2.isEmpty())
                {
                    s1.push(s2.pop());
                }
            }
        }
        public static int remove()
        {
            if(s1.isEmpty())
            {
                return -1;
            }
            return s1.pop();
        }
        public boolean isEmpty(){
            return s1.isEmpty();
        }

    }

}
