import java.util.Arrays;
class QuickSort{
    public static void main(String[] args){
        int[] arr={1,2,3,6,10,25,103,4,5,6};
        quickSort(arr,0,arr.length-1);
        System.out.println("final"+Arrays.toString(arr));
    }
    public static void quickSort(int[] arr,int low,int high){
        if(low>=high)
          return ;
        int pivot = pivot(arr,low,high);
        quickSort(arr,low,pivot-1);
        quickSort(arr,pivot+1,high);
    }
    public static int pivot(int[] arr,int low,int high){
        int pivot = high--;
        while(low<=high){
            if(arr[low]<=arr[pivot])
               low++;
            else if(arr[high]>arr[pivot])
              high--;
            else{
                int temp = arr[low];
                arr[low++] = arr[high];
                arr[high--] = temp;
            }
        }
        if(pivot!=low){
            int temp = arr[low];
            arr[low] = arr[pivot];
            arr[pivot] = temp;
        }
        return low;
    }
}