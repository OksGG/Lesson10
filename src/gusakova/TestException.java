package gusakova;

public class TestException {


    public static void hello(String c){
        String a = "Hello,";
        System.out.println(a+ c + "!");

    }
    public static void main(String[] args){
        String b = "sky";
        if (b != "World"){
            try {
                throw new MyException();
            } catch (MyException e) {
                e.printStackTrace();
            }
        }else{

        }

        hello(b);
    }
}
class MyException extends Exception{
    public MyException() {
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}