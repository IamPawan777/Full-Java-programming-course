import java.util.*;

class Guesser {
    int guess_Guesser;

    int guessingNumberBy_Guesser() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Guesser! Kindly guess the number...");
        guess_Guesser = scan.nextInt();
        return guess_Guesser;
    }
}

class Player {
    int guess_Player;

    int guessingNumberBy_Player() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player! kindly guess the number");
        guess_Player = scan.nextInt();
        return guess_Player;
    }    
}

class Umpire {
    int numFromGuess;
    int numFromP1;
    int numFromP2;
    int numFromP3;

    void collectNum_Guesser() {
        Guesser g = new Guesser();
        numFromGuess = g.guessingNumberBy_Guesser();
    }

    void collectNum_Player() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromP1 = p1.guessingNumberBy_Player();
        numFromP2 = p2.guessingNumberBy_Player();
        numFromP3 = p3.guessingNumberBy_Player();
    }

    void compair() {
        if(numFromGuess == numFromP1) {
            if(numFromGuess == numFromP2 && numFromGuess == numFromP3)
                System.out.println("p1, p2, p3 won");
            else if(numFromGuess == numFromP2)
                System.out.println("p1, p2 won");
            else if(numFromGuess == numFromP3)
                System.out.println("p1, p3 won");
            else
                System.out.println("p1 won");
        }
        else if(numFromGuess == numFromP2) {
            if(numFromGuess == numFromP3)
                System.out.println("p2, p3 won");
            else
                System.out.println("p2 won");
        }
        else if(numFromGuess == numFromP3)
            System.out.println("p3 won");

        else
            System.out.println("Loss Game....Wrong guess");
    }
}

public class GuesserGame {
    public static void main(String[] args) {
        Umpire dhoni = new Umpire();
        System.out.println("Start....");
        dhoni.collectNum_Guesser();
        dhoni.collectNum_Player();
        dhoni.compair();
    }
}
