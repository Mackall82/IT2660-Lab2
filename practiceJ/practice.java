import java.util.Scanner;

public class practice { 
    public static void main(String[] args) {

      int rando = (int) (Math.random( ) * 101);

      System.out.println(rando);

      Scanner input = new Scanner(System.in);

    System.out.println("Enter a number my guy ");

    int guess = input.nextInt();

    if (guess > rando){

        System.out.println("That guess is too high.");
        
    }
    else if(guess < rando){

        System.out.println("Too low my G.");

    }
    else{
        System.out.println("You are too smart!");
    }

    }


}