package info.thinkmore.cofomvn;

import com.google.java.contract.Requires;
import lombok.Getter;


public class App{

    @Getter int b = 4;

    @Requires("a<3")
    public int s(int a){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        App obj = new App();
        obj.s(5);
    }
}
