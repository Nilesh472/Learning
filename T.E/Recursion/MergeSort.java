import java.util.*;
public class MergeSort {
      public static void main(String[] args) {
            int[] arr = {2,3,4,7,1,9,8};
            System.out.println(Arrays.toString(sort(arr)));

      }

      static int[] sort(int[] arr){
            if(arr.length == 1){
                  return arr;
            }
            int mid = arr.length/2;
            int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
            int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));
            return merge(left, right);
      }

      private static int[] merge(int[] first, int[] second){
            int[] conq = new int[first.length + second.length];
            int i=0;
            int j=0;
            int k=0;

            while(i<first.length && j<second.length){
                  if(first[i]<second[j]){
                        conq[k] = first[i];
                        i++;
                  }
                  else{
                        conq[k] = second[j];
                        j++;
                  }
                  k++;
            }
            //it may be possible that any one side of the array is not complete i.e. L.H.S != R.H.S
            //Copy the remaining element of the array
            while(i<first.length){
                  conq[k] = first[i];
                  i++;
                  k++;
            }

            while(j<second.length){
                  conq[k] = second[j];
                  j++;
                  k++;
            }
            return conq;
      }
}
