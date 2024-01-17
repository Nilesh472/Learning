public class QueueUsingArray {
      static class Queue{
            static int arr[];
            static int size;
            static int rear;

            Queue(int size){
                  this.size = size;
                  arr = new int[size];
                  rear=-1;
            }

            public static boolean isEMpty(){
                  return rear == -1;

            }

            public static boolean isFull(){
                  return rear == size-1;
            }

            public static void add(int data){
                  if(isFull()){
                        System.out.println("Queue is full");
                  }
                  arr[++rear] = data;
            }

            public static int remove(){
                  if(isEMpty()){
                        System.err.println("Queue is empty");
                        return -1;
                  }
                  int front = arr[0];
                  for(int i=0; i<rear; i++){
                        arr[i] = arr[i+1];
                  }
                  return front;
            }

            public static int peek(){
                  if(isEMpty()){
                        System.err.println("Queue is empty");
                        return -1;
                  }
                  return arr[0];
            }
      }

      public static void main(String[] args) {
            
            Queue que = new Queue(5);
            que.add(5);
            que.add(4);
            que.add(3);
            que.add(2);

            System.out.println(que.remove());

      }
}
