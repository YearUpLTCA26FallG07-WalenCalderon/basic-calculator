import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Getting input:
            System.out.println("insert first number");
            int first = sc.nextInt();
            System.out.println("insert second number");
            int second = sc.nextInt();

            System.out.println("Insert your operation: ");
            System.out.println("+ to add \n - to substract \n / to divide \n * to multiply");
            String operation = sc.next();
            char operationChar = operation.charAt(0);

            //What operation?
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

    // add 2 int numbers method
    public static void add (int first, int second){
        System.out.println(first + second);

    }
    // substract 2 int numbers method
    public static void substract (int first, int second){
        System.out.println(first - second);

    }
    // divide 2 int numbers method
    public static void divide (int first, int second){
        System.out.println(first / second);

    }
    // 2 int numbers method
    public static void multiply (int first, int second){
        System.out.println(first * second);

    }

}
