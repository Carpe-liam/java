import java.util.*;

public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Can You Feel My Heart", "I'm terrorized by a thousand ghosts, but no one can tell");
        trackList.put("Numb", "Sweet and spicy like cook.");
        trackList.put("Fancy Like", "Fancy like applebees on date night.");
        trackList.put("Mad Hatter", "Is there anywhere left for me to go.");

        Set<String> keys = trackList.keySet();
        for(String key : keys) {
            System.out.println("----------------------");
            System.out.println(key + ": " + trackList.get(key));
        }
        System.out.println("----------------------");
        System.out.println(trackList.get("Numb"));
        System.out.println("----------------------");
    }
} 