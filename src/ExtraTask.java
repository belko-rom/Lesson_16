import java.util.ArrayDeque;
import java.util.Deque;

public class ExtraTask {
    public static boolean isBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        for (char bracket : input.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if ((bracket == ')' && openBracket != '(') ||
                        (bracket == '}' && openBracket != '{') ||
                        (bracket == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();// проверяем, что стек пуст (все открывающие скобки были закрыты)
    }

    public static void main(String[] args) {
        String input = "([{{[(())]}}])";
        if (isBalanced(input)) {
            System.out.println("Строка " + input + " - Сбалансирована!");
        } else {
            System.out.println("Строка " + input + " - Не сбалансирована!");
        }
    }
}

//() - сбалансирована
//[()] - сбалансирована
//{[()]} - сбалансирована
//([{{[(())]}}]) - сбалансирована
//{{[]()}}}} - не сбалансирована
//{[(])} - не сбалансирована


