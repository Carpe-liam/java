import java.util.*;

//instances

public class Puzzle {

    Random random = new Random();

    public ArrayList<Integer> getTenRolls() {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for(int i =0; i<10; i++){
            int val = random.nextInt(20);
            nums.add(val);
        }
        return nums;
    }

    public String getRandomLetter() {
        String[] alphs = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        int val = random.nextInt(26);
        String randomLet = alphs[val];
        return "Random letter = " + randomLet;
    }

    public String generatePassword() {
        String password = "";
        String[] alphs = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
            for(int i=0; i<8; i++) {
                int val = random.nextInt(26);
                String randomLet = alphs[val];
                password += randomLet;
        }
        return password;
    }

    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }




}