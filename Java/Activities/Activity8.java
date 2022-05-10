public class Activity8 {

    public static void exceptionTest(String str) throws customException {
        if(str==null)
        {
            throw new customException("Null values");
        }
        else
            System.out.println(str);


    }

    public static void main(String[] args) throws customException {
        try{
            exceptionTest("Hello");
            exceptionTest(null);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
}

class customException extends Exception{
    private String message;
    customException(String msg)
    {
        message=msg;
    }

    public String getMessage(){
        return message;

    }
}
