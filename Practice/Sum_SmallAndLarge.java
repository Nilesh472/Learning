public class Sum_SmallAndLarge {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(small > arr[i]){
                small = arr[i];
            }
            if(large < arr[i]){
                large = arr[i];
            }
        }
        int sum = small + large;
        System.out.println(sum);
    }
}
