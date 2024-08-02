import java.util.Arrays;
class SelectionSort{
    public static void main(String[] args){
        int[] arr={1,9,5,6,3,2,8,7};
        selectionSort(arr,arr.length);
        System.out.println("final"+Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr,int n){
        if(n==1)
          return ;
        int index = getMax(arr,1,n,0);
        if(index!=n-1){
            int temp = arr[index];
            arr[index] = arr[n-1];
            arr[n-1] = temp;
        }
        System.out.println(Arrays.toString(arr));
        selectionSort(arr,n-1);
    }
    public static int getMax(int[] arr,int index,int n,int max){
        if(index==n)
          return max;
        if(arr[max]<arr[index])
          max= index;
        return getMax(arr,index+1,n,max);
    }
}