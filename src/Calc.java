public class Calc {

    public static void main(String[] args) {
        System.out.println("The sum is: " + sum(4,5));
        System.out.println("The subtraction is: " + substract(4,5));
        System.out.println("The multiplication is: " + multiplication(4,5));
        System.out.println("The division is: " + division(4,5));
    }


    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int substract(int a, int b){
        int substract = a - b;
        return substract;
    }

    public static int multiplication(int a, int b){
        int multiplication = a * b;
        return multiplication;
    }

    public static float division(int a, int b){
        float division = (float)a / b;
        return division;
    }

}
