import java.util.ArrayList;

public class Exceptions{
    public static void main(String[] args) {
        //Create ArrayList
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hello World");
        myList.add(48);
        myList.add("Goodbye for today.");
        System.out.println(myList);

        //Use try/catch blocks to handle the exceptions
            for(int i = 0; i < myList.size(); i++){
                //Try to cast each element to an Integer
            try{
                Integer castedValue = (Integer) myList.get(i); //can not pass the 3 strings to an integer, should should an error for each occurrence. 
                System.out.println(castedValue);
            }
            catch(Exception error){
                System.out.println("Exception error. Check your code.");
            }
        }
    }
}

/*NOTE:  
In this case, if there is no try/catch, will throw the following error:
Exception in thread "main" java.lang.ClassCastException: java.lang.String cannot be cast to java.lang.Integer
at Exceptions.main(Exceptions.java:18)*/