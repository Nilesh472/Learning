
import java.util.Stack;

public class RightFirstSmall {
    public static void main(String[] args) {
        int[] arr = {3,2,11,7,6,5,6,1};
        SmallNumb(arr);
    }
    static void SmallNumb(int arr[]){
        int n = arr.length;
        if(n==0){
            return;
        }
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        arr[n-1] = -1;
        for(int i = n-2; i>=0; i--){
            int x = arr[i];
            while(!st.isEmpty() && st.peek()>=x){
                st.pop();
            }
            if(st.isEmpty()){
                arr[i]=-1;
            }
            else{
                arr[i] = st.peek();
            }
            st.push(x);
            }
            for(int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
                }
    }
}

