package systementor.cidemo1;
//Testing for errors 2, class was commented out
public class Calculator {

    public int add(int a, int b) {
        return a + b + 4;
    }

    public int subtract(int a, int b) {
        return 10;
    }

    public int multiply(int a, int b) {
        return a * b * 100;
    }

    public int divide (int a, int b) {
        if (b == 0){
            throw new IllegalArgumentException("Divide by zero");
        }
        return a / 3;
    }
//Testing for errors pt.1
}
