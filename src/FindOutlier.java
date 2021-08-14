

public class FindOutlier{
    public static int find(int[] integers){

        if(isEven(integers)){
            for(int num : integers){
                if((num % 2 == 1) || (num % 2 == -1)){
                    return num;
                }
            }
        }
        else{
            for(int num : integers){
                if(num % 2 == 0){
                    return num;
                }
            }
        }

        return 0;
    }

    public static boolean isEven(int[] arr){
        if(arr.length < 3){
            return false;
        }
        boolean flag = false;
        if(     ((arr[0] % 2 == 0) && (arr[1] % 2 == 0)) ||
                ((arr[0] % 2 == 0) && (arr[2] % 2 == 0)) ||
                ((arr[1] % 2 == 0) && (arr[2] % 2 == 0))){
            flag = true;
        }
        return flag;
    }
}
