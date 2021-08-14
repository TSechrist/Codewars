

public class UserInput {

    public static class TextInput {

        protected String curr = "";

        public void add(char c){
            curr += c;
        }
        public String getValue(){
            return curr;
        }
    }

    public static class NumericInput extends TextInput {

        public void add(char c){
            if (Character.isDigit(c)){
                curr += c;
            }
        }
        public String getValue(){
            return curr;
        }

    }

    public static void main(String[] args) {
        //TextInput input = new NumericInput();
        //input.add('1');
        //input.add('a');
        //input.add('0');
        //System.out.println(input.getValue());
    }
}