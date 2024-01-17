import java.util.Stack;
// Insertion Time complexity is O(1) and removal is O(n)
public class QueueUsingStack {
      private Stack<Integer> s1;
      private Stack<Integer> s2;

      public QueueUsingStack(){
            s1 = new Stack<>();
            s2 = new Stack<>();
      }

      public boolean isEmpty(){
            return s1.isEmpty();
      }

      public void add(int data){
            s1.push(data);
      }
      public int remove(){
            while(!s1.isEmpty()){
                  s2.push(s1.pop());
            }
            int removed = s2.pop();

            while(!s2.isEmpty()){
                  s1.push(s2.pop());
            }

            return removed;
      }

      public int peek(){
            while(!s1.isEmpty()){
                  s2.push(s1.pop());
            }
            int peeked = s2.peek();

            while(!s2.isEmpty()){
                  s1.push(s2.pop());
            }

            return peeked;
      }
      

      public static void main(String[] args) {
            QueueUsingStack q = new QueueUsingStack();

            q.add(5);
            q.add(10);
            q.add(15);
            System.out.println(q.remove());
      }
}
