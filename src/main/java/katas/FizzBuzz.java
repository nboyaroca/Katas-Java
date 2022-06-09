package katas;

public class FizzBuzz {

    private String result;

    public String getResult() {
        return this.result;
    }

    public void returnFizzBuzz(int num) {
        if ( num%5 == 0 && num%3 == 0 ) {
            this.result = "FizzBuzz";
        } else if ( num%5 == 0 ) {
            this.result = "Buzz";
        } else if ( num%3 == 0 ) {
            this.result = "Fizz";
        } else {
            this.result = java.lang.String.valueOf(num);
        }
    }

}
