public class missingbetter {
    public static void main(String []args){
        int[]arr={8,2,4,5,3,7,1};
        System.out.println(missinNum(arr));
    }

     public static int missinNum(int[]arr){
        int n =arr.length+1;
        int[] hash = new int[n+1];

        for(int num:arr){
            hash[num]=1;
        }

        for(int i=1;i<=arr.length;i++){
            if (hash[i]==0) {
                return i;
            }
        }

        return -1;
     }
}
