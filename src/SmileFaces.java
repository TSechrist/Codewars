import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {

        if(arr.size() == 0){
            return 0;
        }

        int count = 0;

        for(String face : arr){
            if(checkEyes(face) && checkMouth(face) && checkNose(face)){
                count++;
            }
        }

        return count;
    }

    private static boolean checkEyes(String s){
        return (s.charAt(0) == ':' || s.charAt(0) == ';');
    }

    private static boolean checkMouth(String s){
        return (s.charAt(s.length() - 1) == ')' || s.charAt(s.length() - 1) == 'D');
    }

    private static boolean checkNose(String s){

        if(s.length() == 3){
            return (s.charAt(1) == '-' || s.charAt(1) == '~');
        }
        else return (s.length() == 2);
    }
}