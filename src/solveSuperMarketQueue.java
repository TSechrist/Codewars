import java.util.ArrayList;
import java.util.List;

public class solveSuperMarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        List<Integer> lst = new ArrayList<>();
        int total = 0;

        for (int customer : customers) {
            lst.add(customer);
        }

        while(lst.size() > 0){

//            for(int i = lst.size() - 1; i >= 0; i--){
//                if(lst.get(i) == 0){
//                    lst.remove(i);
//                }
//            }

            if(lst.size() >= n){
                for(int i = 0; i < n; i++){
                    lst.set(i, lst.get(i) - 1);
                }
            }
            else{
                for(int i = 0; i < lst.size(); i++){
                    lst.set(i, lst.get(i) - 1);
                }
            }

            for(int i = lst.size() - 1; i >= 0; i--){
                if(lst.get(i) == 0){
                    lst.remove(i);
                }
            }
            total++;
        }
        if(total == -1){
            total = 0;
        }
        return total;
    }
}
//        int total = 0;
//        int ntemp = n;
//        int count = 0;
//        int arrLength = 0;
//        int[] newArr = new int[customers.length];
//        boolean flag = false;
//
//        while(count < n){
//            newArr[count] = customers[count];
//            count++;
//            arrLength++;
//            ntemp--;
//        }
//
//        while(arrLength > 0){
//
//            flag = false;
//            for(int i = 0; i < arrLength; i++){
//                if(newArr[i] == 0){
//                    flag = true;
//                }
//            }
//            if(flag){
//                arrLength--;
//            }
//        }
//
//        return total;
//    }
//
//    public static void printArr(int[] arr){
//        for(int i = 0; i < arr.length; i++){
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    public static boolean checkFlag(int[] arr){
//
//        boolean flag = false;
//        for(int i = 0; i < arr.length; i++){
//            if(arr[i] == 0){
//                flag = true;
//            }
//        }
//        return flag;
//    }
//
//    public static int[] decrease(int[] arr){
//
//        int[] nArr = new int[arr.length];
//        for(int i = 0; i < arr.length; i++){
//            nArr[i] = arr[i] - 1;
//        }
//        return nArr;
//    }
