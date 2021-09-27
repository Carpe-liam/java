import java.util.*;


public class Demo {


    public ArrayList<String> getNewPasswordSet(int length) {
        ArrayList<String> passwordSet = new ArrayList<String>();
        for(int i=0; i<length; i++) {
            passwordSet.add(generatePassword());
        }
        System.out.println(getNewPasswordSet(5));
    }
}
