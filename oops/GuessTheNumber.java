// this a game where the user have to guess the number that the computer has chosen between 0 t0 100 using oops
package OOPS;
import java.util.Scanner;
import java.util.Random;

class Number {
    int number;
    Number(){
        Random rand = new Random();
        number = rand.nextInt(101);
    }
    public int getNumber(Scanner sc){
        System.out.println("\nGuess the number between 1 to 100");
        return sc.nextInt();
    }
    public boolean checkNumber(int Guess, int count){
        if(Guess == number){
            System.out.println("\n|===You have guessed the number===|");
            System.out.println("|===You took " + count+ " attempts===|");
            return true;
        }
        else if(Guess<number){
            System.out.println("\n---Your guess is too low---");
        }
        else{
            System.out.println("\n---Your guess is too high---");
        }
        return false;
    }

    
}

public class GuessTheNumber {
    public static void main(String[] args) {
        System.out.println("----Welcome, This is a guessing game in which i will choose a number between 1 to 100 and you have to guess it----");

        Scanner sc = new Scanner(System.in);
        Number random = new Number();
        int count =1;

        boolean isCorrect = false;
        while(!isCorrect){
            int guess = random.getNumber(sc);
            isCorrect = random.checkNumber(guess, count);
            count++;
        }  
        sc.close();
        System.out.println("\n--------Game Over!--------");
    }
}
