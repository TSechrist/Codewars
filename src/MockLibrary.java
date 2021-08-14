import java.lang.reflect.*;
import java.util.*;

interface TestInterface {
    int calculate(int a, int b);
    String calculate(String a, String b);
    String getValue();
}

public class MockLibrary implements InvocationHandler {

    MockLibrary obj;
    Object res;

    @Override

    //I don't have much experience with using the InvocationHandler and making mock methods.
    //If I had more time, I would download and learn the Mockito testing framework to figure
    //out where my weaknesses lied with this program. I came across that framework a bit
    //while trying to research help for this program.
    //I tried to implement the error handling and fix the method calls with what I thought
    //was being asked.

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        try{
            if((method.getName().contains("calculate")))
            {
                return method.invoke(obj, args);
            }
            else {

                throw new java.lang.IllegalArgumentException("");
            }

        } catch (InvocationTargetException e) {
            throw e;
        } catch (NullPointerException e) {
            throw e;
        }

    }

    //I couldn't figure out how to make this work while keeping the returntype as MockLibrary
    public MockLibrary when(String method, Object[] args) {

        //Checking if the passed method and arguments are valid
        if (method.equals("calculate")){
            if (args[0] instanceof String){
                //Adding the strings
                res = (args[0].toString() + args[1].toString());
            }
            else if (args[0] instanceof Integer) {
                //Adding the ints
                res = ((int)args[0] + (int)args[1]);
            }
            else {
                throw new java.lang.IllegalArgumentException("");
            }

            return this;
        }
        return null;
    }

    public void thenReturn(Object val) {

        //Printing out if the object that was given in the chain matches the passed argument
        if (val instanceof String){
            System.out.println(res.equals(val));
        }
        else {
            System.out.println(res == val);
        }

    }

    public static void main(String[] args) {
        MockLibrary handler = new MockLibrary();
        TestInterface ref = (TestInterface) Proxy.newProxyInstance(
                MockLibrary.class.getClassLoader(),
                new Class[]{TestInterface.class}, handler);

        handler.when("calculate", new Object[] {1, 2}).thenReturn(3);
        handler.when("calculate", new Object[] {"a", "b"}).thenReturn("ab");

        System.out.println(ref.calculate(1, 2)); // prints 3
        System.out.println(ref.calculate("a", "b")); // prints "ab"
    }
}
