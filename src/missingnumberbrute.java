public class missingnumberbrute {
    public static void main(String[]args){
        int[]arr={8,2,4,5,3,7,1};
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[]arr){
        int n =arr.length+1;
        for(int i=1;i<=n;i++){
            boolean found =false;
            for(int j=1;j<arr.length;j++){
                if(arr[j]==i){
                    found=true;
                    break;
                }

            }
            if(!found){
                return i;
            }
        }
        return -1;
    }



}
