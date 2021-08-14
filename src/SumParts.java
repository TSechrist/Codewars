

class SumParts {

    public static int[] sumParts(int[] ls) {

        int[] sumLst = new int[ls.length + 1];
        int sum = 0;

        for(int num : ls){
            sum += num;
        }

        sumLst[0] = sum;

        for(int i = 0; i < ls.length; i++){
            sum -= ls[i];
            sumLst[i + 1] = sum;
        }

        return sumLst;
    }
}