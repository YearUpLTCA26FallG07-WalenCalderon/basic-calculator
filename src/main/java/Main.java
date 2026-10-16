import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("insert first number");
            int first = sc.nextInt();
            System.out.println("insert second number");
            int second = sc.nextInt();

            System.out.println("Insert your operation: ");
            System.out.println("+ to add \n - to substract \n / to divide \n * to multiply");
            String operation = sc.next();
            char operationChar = operation.charAt(0);


            if (operationChar == '+'){
                add(first,second);

            } else if (operationChar == '-') {
                substract(first,second);
            } else if (operationChar == '/'){
                divide(first,second);
            } else if (operationChar == '*'){
                multiply(first,second);
            } else{
                System.out.println("Not an option");
            }
        }

    public static void add (int first, int second){
        System.out.println(first + second);

    }

    public static void substract (int first, int second){
        System.out.println(first - second);

    }

    public static void divide (int first, int second){
        System.out.println(first / second);

    }

    public static void multiply (int first, int second){
        System.out.println(first * second);

    }

}
