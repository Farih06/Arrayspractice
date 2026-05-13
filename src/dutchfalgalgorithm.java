import java.util.Arrays;
public class dutchfalgalgorithm {
    public static int[] dutchfalgalgo(int arr[]){

        int n =arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while(mid<=high){
            if(arr[mid]==0){
                arr[mid]=arr[low];
                arr[low]=0;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                arr[mid]=arr[high];
                arr[high]=2;
                high--;
            }

        }
        return arr;
    }
    public static void main(String [] args){
        int arr[ ] ={1,1,0,2,0,1,2,0,2};
        System.out.println(Arrays.toString(dutchfalgalgo(arr)));
    }
}
