public class FizzBuzz{

    public void FizzBuzzTester(){
        for(int i = 1; i <= 50; i++){
            String output = fizzBuzz(i);
            System.out.println("Number: " + i + " - " + "Output: " + output);
        }
    }
    public String fizzBuzz(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
            return "Fizz";
        }

        else if(number % 5 == 0){
            return "Buzz";
        }

        else {
            return Integer.toString(number);
        }
    }
}