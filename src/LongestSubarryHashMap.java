
import java.util.HashMap;
public class LongestSubarryHashMap {
    public static int LongestSArrayHmap(int []arr,int k){


        //intialize hashmap
        HashMap<Integer,Integer>map=new HashMap<>();
        int n =arr.length;
        int sum =0;
        int maxlen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum==k){
                maxlen =i+1;
            }
            int rem = sum-k;

            if(map.containsKey(rem)){
                int len = i-map.get(rem);
                maxlen=Math.max(maxlen,len);
            }
            if(!map.containsKey(sum)){
                map.put(sum,i);
            }



        }
 return maxlen;
    }
    public static void main (String []args){
        int[] arr={1,2,3,1,1,1,1};
        int k=3;
        System.out.println(LongestSArrayHmap(arr,k));

    }
}


