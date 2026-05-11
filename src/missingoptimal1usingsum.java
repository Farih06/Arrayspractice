public class missingoptimal1usingsum {
    public static void main(String[]args){
        int[]arr={8,2,4,5,3,7,1};
        System.out.println(missingNum(arr));
    }

    public static int missingNum(int[]arr){
        int n = arr.length+1;

        int sumofn = (n*(n+1))/2;
        int arrsum=0;
        int findans =0;
        for(int i=0;i<arr.length;i++){
            arrsum = arrsum + arr[i];
        }
        findans= sumofn-arrsum;
        return findans;
    }


}
