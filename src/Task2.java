import java.util.HashMap;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        String[] input1 = {"code", "bug"};
        String[] input2 = {"man", "moon", "main"};
        String[] input3 = {"man", "moon", "good", "night"};

        System.out.println(pairs(input1));
        System.out.println(pairs(input2));
        System.out.println(pairs(input3));
    }

    public static Map<String, String> pairs(String[] strings) {
        Map<String, String> resultMap = new HashMap<>();
        for (String str : strings) {
            if (str.length() > 0) {
                char firstChar = str.charAt(0);
                char lastChar = str.charAt(str.length() - 1);
                resultMap.put(String.valueOf(firstChar), String.valueOf(lastChar));
            }
        }
        return resultMap;
    }
}
