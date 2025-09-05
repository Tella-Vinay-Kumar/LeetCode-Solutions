import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] arr= {6,8,0,1,3};
        System.out.println(Arrays.toString(findNextGreater(arr)));
    }
    public static int[] findNextGreater(int[] arr)
    {
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];
        for(int i=arr.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nextGreater[i]=-1;
            }else{
                nextGreater[i]=s.peek();
            }
            s.push(arr[i]);
        }
        return nextGreater;

    }
}
