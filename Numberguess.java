import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Numberguess {
    public static void main(String[] args) {
        int[] numbers = new int[0];
        Scanner sc = new Scanner(System.in);
        System.out.println("Let the game begin! .... -> Enter your name: ");
        String name = sc.nextLine();
        System.out.println("The random number(between 0 and 100) is chosen by the system..");
        int number;
        Random rand = new Random();
        int mainnumber = rand.nextInt(101);
        while (true) {
            System.out.print("Enter the number which you guess (between 0 and 100): ");
            if (sc.hasNextInt()){
                number = sc.nextInt();
                    if(number ==mainnumber){
                        System.out.println("Congratulations, " + name);
                        numbers=Arrays.copyOf(numbers, numbers.length+1);
                        numbers[numbers.length-1]=number;
                        mainnumber = rand.nextInt(101);
                        System.out.println("Your numbers: " + Arrays.toString(numbers));
                        System.out.println("The Game finished ------- New game starts..");
                        System.out.println("The random number (between 0 and 100) is chosen by the system..");
                        numbers= new int[0];
                    }else{
                        numbers=Arrays.copyOf(numbers, numbers.length+1);
                        numbers[numbers.length-1]=number;
                        if(number<mainnumber){System.out.println("Your number is too small. Please try again.");continue;}
                        else{System.out.println("Your number is too big. Please, try again.");continue;}
                    }
            }else{
                System.out.println("Please enter a number!");
                sc.next();
            }
        }
    }
}
