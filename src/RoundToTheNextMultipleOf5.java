
public class RoundToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {

        if((number % 5) == 0){
            return number;
        }

        int num = number;
        num = num / 5;

        if(number > 0){
            return (num * 5) + 5;
        }
        else{
            return (num * 5) ;
        }
    }
}
