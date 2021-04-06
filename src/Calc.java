public class Calc {

    public static void main(String[] args) {
        System.out.println("The sum is: " + sum(4,5));
        System.out.println("The sum is: " + substract(4,5));
    }


    public static int sum(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int substract(int a, int b){
        int substract = a - b;
        return substract;
    }

}
