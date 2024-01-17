import java.util.Stack;
public class QueueUsingStack2 {
      private Stack<Integer> s1;
      private Stack<Integer> s2;
      
      public QueueUsingStack2(){
            s1 = new Stack<>();
            s2 = new Stack<>();
      }
      public boolean isEmpty(){
            return s1.isEmpty();
      }

      public void add(int data){
            while(!s1.isEmpty()){
                  s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty()){
                  s1.push(s2.pop());
            }   
      }

      public int pop(){
            return s1.pop();
      }

      public int peek(){
            return s1.peek();
      }

      public static void main(String[] args) {
            QueueUsingStack2 q = new QueueUsingStack2();

            q.add(5);
            q.add(10);
            q.add(15);
            System.out.println(q.pop());
      }
}
