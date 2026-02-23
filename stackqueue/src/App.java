import utils.Queue;
import utils.Stack;


public class App {

    public static String characterless(String text) {
        return text
                .toLowerCase()
                .replaceAll("[^a-z0-9]", "");
    }

    public static boolean ispalindrome(String text) {
        Stack stack = new Stack();
        Queue queue = new Queue();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            stack.push(c);
            queue.finalQueue(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.initQueue()) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) throws Exception {

        String entrada = "Socorram-me subi no ônibus em Marrocos";

        System.out.println(entrada);
        
        String textAnalyze = characterless(entrada);
        System.out.println(characterless(textAnalyze));

        if (ispalindrome(textAnalyze)) {
            System.out.println("É um palíndromo ");
        } else {
            System.out.println("Não é um palíndromo ");   
         }
}
}
