import java.util.*;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {

        List<String> lst = new ArrayList<>();
        Collections.addAll(lst, arr);
        boolean flag = true;

        while(flag){
            flag = false;
            for(int i = lst.size() - 1; i > 0; i--){
                switch (lst.get(i)) {
                    case "NORTH":
                        if (lst.get(i - 1).equals("SOUTH")) {
                            lst.remove(i);
                            lst.remove(i - 1);
                            i--;
                            flag = true;
                        }
                        break;
                    case "SOUTH":
                        if (lst.get(i - 1).equals("NORTH")) {
                            lst.remove(i);
                            lst.remove(i - 1);
                            i--;
                            flag = true;
                        }
                        break;
                    case "EAST":
                        if (lst.get(i - 1).equals("WEST")) {
                            lst.remove(i);
                            lst.remove(i - 1);
                            i--;
                            flag = true;
                        }
                        break;
                    case "WEST":
                        if (lst.get(i - 1).equals("EAST")) {
                            lst.remove(i);
                            lst.remove(i - 1);
                            i--;
                            flag = true;
                        }
                        break;
                    default:
                        break;
                }
            }
        }

        String[] reducArr = new String[lst.size()];
        for(int i = 0; i < reducArr.length; i++){
            reducArr[i] = lst.get(i);
        }

        return reducArr;
    }
}