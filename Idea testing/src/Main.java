import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1){
            System.out.println(number + " is not a prime number");
        }
        for (int i = 2; i < number; i++){
            if(number % i ==0){
                System.out.println(number + " is not a prime number");
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(number + " is a prime number");
        }


    }

}
