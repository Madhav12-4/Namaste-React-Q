import java.util.Arrays;
class BubbleSort{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        bubbleSort(arr,arr.length);
        System.out.println("final"+Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr,int n){
        if(n==1)
          return;
        boolean isSwap =  swapBubble(arr,1,n,false);
        System.out.println(Arrays.toString(arr));
        if(!isSwap)
          return;
        else
          bubbleSort(arr,n-1);
    }
    public static boolean swapBubble(int[] arr,int index,int n,boolean isSwap){
        if(n==index)
           return isSwap;
        if(arr[index-1]>arr[index]){
            int temp= arr[index-1];
            arr[index-1] = arr[index];
            arr[index]= temp;
            isSwap =  true;
        }
        return swapBubble(arr,index+1,n,isSwap);
    }
}
