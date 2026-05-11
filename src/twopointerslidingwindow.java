import java.sql.SQLOutput;

public class twopointerslidingwindow {

    public static int twoPointerSubarray(int[]arr,int k){
        int right=0,left=0;
        int maxlen=0;
        int n=arr.length;
        int sum =arr[0];
        while(right<n){

            while(left<=right && sum>k ){

                sum -= arr[left];
                left++;
            }
            if(sum==k){
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;

            if(right<n){
                sum+=arr[right];
            }

        }

        return maxlen;
    }
    public static void main(String []args){
        int[] arr = {1,2,3,1,1,1,1};

        int k = 3;
        System.out.println(twoPointerSubarray(arr,k));
    }
}
