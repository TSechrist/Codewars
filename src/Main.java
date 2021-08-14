import java.util.*;

public class Main {

    public static void main(String[] args) {
        int x  = 12344321;
        String y = String.valueOf(x);
        String z = y.substring(y.length() / 2, y.length());
        System.out.println(z.reverse());
    }

}



