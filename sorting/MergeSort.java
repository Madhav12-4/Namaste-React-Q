import java.util.Arrays;
class MergeSort{
    public static void main(String[] args){
        int[] arr={9,8,7,6,1,4,3,2,1};
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void mergeSort(int[] arr){
        int n = arr.length;
        mergeSort(arr,0,n-1);
    }
    public static void mergeSort(int[] arr,int low,int high){
        if(low>= high)
          return ;
        int mid = (low+high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr, mid+1, high);
        merge(arr,low,mid,high);

    }
    public static void merge(int[] arr,int low,int mid,int high){
        int[] temp = new int[high-low+1];
        int i=low,j=mid+1,k=0;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k++] = arr[i++];
            }
            else 
              temp[k++] = arr[j++];
        }
        while(i<=mid)
          temp[k++] = arr[i++];
        while(j<=high)
          temp[k++] = arr[j++];
        for(i = low,k=0;i<=high;i++,k++)
          arr[i] = temp[k];
          
    }
}