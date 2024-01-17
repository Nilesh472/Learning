import java.util.*;
public class StackAL {
      static class Stack{
            ArrayList<Integer> list = new ArrayList<>();

            public void push(int data){
                  list.add(data);
            }
            public boolean isEMpty(){
                  return list.size()==0;
            }
            public int pop(){
                  if(isEMpty()){
                        return -1;
                  }
                  int top = list.remove(list.size()-1);
                  return top;
            }

            public int peek(){
                  if(isEMpty()){
                        return -1;
                  }
                  return list.get(list.size()-1);
            }
            
      }

      public static void main(String args[]){
            Stack stack = new Stack();
            stack.push(25);
            stack.push(24);
            stack.push(23);
            stack.push(22);

            while (!stack.isEMpty()) {
                  System.out.println(stack.peek());
                  stack.pop();
            }
            
      }
}
