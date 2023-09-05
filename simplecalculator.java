import java.util.Scanner;

class Calculator {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What would you like to perform? (sum, sub, mul, div) ");
        String operation = scanner.nextLine();
        operation = operation.toUpperCase();

        if(operation.equals("SUM")){
            System.out.printf("%f + %f = %f", number1, number2, number1+number2);

        }else if (operation.equals("SUB")){
            System.out.printf("%f - %f = %f", number1, number2, number1-number2);

        } else if (operation.equals("MUL")){
            System.out.printf("%f x %f = %f", number1, number2, number1*number2);
        }
        else if (operation.equals("DIV")){
            if (number2 == 0 || number1 == 0){
                System.out.print("can not divide by zero");
            }
            else{
            System.out.printf("%f / %f = %f", number1, number2, number1/number2);
            }
        }
         else{
            System.out.printf("%s is not a supported operation", operation);
        }

        scanner.close();
    }
}
