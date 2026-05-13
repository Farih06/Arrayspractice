public class kandanealgorighthm {

    public static int kandanealgo(int []arr){
     int n = arr.length;
     int start=0;
     int sum=0;
     int startans=0;
     int endans=0;
     int maxi= Integer.MIN_VALUE;

     for(int i=0;i<n;i++){

         if(sum==0){
             start=i;
         }
         sum+=arr[i];
         if(sum>maxi){

             maxi=sum;
             startans=start;
             endans=i;

         }
         if(sum<0){
             sum=0;
         }

     }
        for(int i=startans;i<=endans;i++){
            System.out.print(arr[i]+" ");
        }
     return maxi;
    }

    public static void main(String[]args){


        int[] arr = {-2,1,-3,4,-1,2,1};


        System.out.println("maximum sum ="+kandanealgo(arr));

    }
}

