import java.util.Scanner;

class switchcases {
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

        switch(operation){
            case "SUM":
            System.out.printf("%f + %f = %f", number1, number2, number1+number2);
            break;

            case "SUB":
            System.out.printf("%f - %f = %f", number1, number2, number1-number2);
            break;

            case "MUL":
            System.out.printf("%f * %f = %f", number1, number2, number1*number2);
            break;

            case "DIV":
            if(number2 == 0 || number1 == 0){
                System.out.print("can not divide by 0");
            } else{
            System.out.printf("%f/ %f = %f", number1, number2, number1/number2);
            }
            break;

         default:
            System.out.printf("%s is not supported", operation);
        }
    scanner.close();
    }
}