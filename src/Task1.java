import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {

        String[] Array = {"a", "a", "a", "b", "c", "e", "c"};

        HashMap<String, Boolean> wordMultiple = new HashMap<>();

        for (String word : Array) {
            if (wordMultiple.containsKey(word)) {
                wordMultiple.replace(word, true);
            } else {
                wordMultiple.put(word, false);
            }
        }
        System.out.println(wordMultiple);
    }
}