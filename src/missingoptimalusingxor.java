public class missingoptimalusingxor {
    public static void main(String[]args){
        int[]arr={8,2,4,5,3,7,1};
        System.out.println(missingNum(arr));
    }
    public static int missingNum(int[] arr){
        int n=arr.length+1;

        int xor1=0,xor2=0;

        for(int i=0;i<arr.length;i++){
            xor1=xor1^arr[i];
            xor2=xor2^(i+1);
        }
        xor2=xor2^n;
        return xor1^xor2;

    }


}
