import org.testng.annotations.Test;

public class FizzBuzzTest {

    public void fizzBuzz(int x){
        for (int i = 1; i < x; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }
    }

    @Test
    public void test(){
        fizzBuzz(50);
    }
}
