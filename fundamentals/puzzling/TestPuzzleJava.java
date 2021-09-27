import java.util.ArrayList;
import java.util.Random;

public class TestPuzzleJava {
    public static void main(String[] args) {
    System.out.println("-----------------------------");
        Puzzle generator = new Puzzle();
        ArrayList<Integer> randomRolls = generator.getTenRolls();
    System.out.println("---- Random Rolls ----");
        System.out.println(randomRolls + "\n");
        
        // Write your other test cases here.
// random letter
    System.out.println("---- Random Letter ----");
        String genLetter = generator.getRandomLetter();
        System.out.println(genLetter + "\n");
// generate password
    System.out.println("---- Random Password ----");
        String password = generator.generatePassword();
        System.out.println( "Your random password is: " + password + "\n");
// generate new password set
    System.out.println("---- New Password Set----");
        ArrayList<String> passwordSet = generator.getNewPasswordSet(2);
        System.out.println(passwordSet + "\n");
    }
}

