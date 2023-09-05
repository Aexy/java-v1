import java.util.Scanner;
class userInp {
   public static void main (String[] args){
     Scanner scanner = new Scanner (System.in);

     System.out.print("What is your name ? ");
     String name = scanner.nextLine();

     System.out.printf("Hi %s. How old are you? ", name);
     int age = Integer.parseInt(scanner.nextLine());

     System.out.printf("%d is a great age, What is your main language? ", age);
     String language = scanner.nextLine();

     System.out.printf("%s is a decent language",language);
     scanner.close();
   }
}
