import java.util.*;

public class uniqueNames{

    public static String[] uniqueNames(String[] names1, String[] names2) {

        String[] ret = new String[names1.length + names2.length];
        int count = 0;

        for (int i = 0; i < names1.length; i++){
            if (!Arrays.asList(ret).contains(names1[i])){
                ret[count] = names1[i];
                count++;
            }
        }

        for(int i = 0; i < names2.length; i++){
            if (!Arrays.asList(ret).contains(names2[i])){
                ret[count] = names2[i];
                count++;
            }
        }
        String[] temp = new String[count];
        for (int i = 0; i < count; i++){
            temp[i] = ret[i];
        }

        return temp;
        //        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

}
