public class Printer {

    public static String printerError(String s) {

        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) > 'm'){
                count++;
            }
        }

        String res = (String.valueOf(count) + '/' + s.length());

        return res;
    }
}