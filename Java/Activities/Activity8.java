package activities;

public class Activity8 {

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }

    public static void main(String[] args){
        try{
            Activity8.exceptionTest(null);
        } catch (CustomException e) {
            throw new RuntimeException(e);
        }
    }
}
