import java.util.*;

public class postFixExpression {

    public static void main(String arg[]) {
        Stack<Character> s = new Stack<Character>();
        Scanner in = new Scanner(System.in);

        String exp = in.nextLine();
        //Write your code here
        System.out.println(infixToPostfix(exp));
    }

    // A utility function to return precedence of a given operator
    // Higher returned value means higher precedence

    static int precedence(char ch){

        switch(ch){
            // give 1 to plus and minus
            case '+':
            case '-':
                return 1;
            //give 2 to product and divide
            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String exp){

        //Create a new String builder object to store the result.
        StringBuilder result = new StringBuilder();

        //initialize empty stack
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<exp.length(); i++) {
            // Logic to use the stack to get the desired postFix

            //read the character one by one
            char c = exp.charAt(i);

            if (Character.isLetterOrDigit(c)) result.append(c);
            else if (c == '(') stack.push(c);
            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    result.append(stack.pop());
                }
                stack.pop();// clear '(' from the stack
            } else {
                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
                    result.append(stack.pop());
                }
                stack.push(c);
            }
        }

            //pop all the operators from the stack

            while(!stack.isEmpty()){
                if(stack.peek()=='(') return "Invalid Expression"; // to prevent not closed brackets
                result.append(stack.pop());
            }

            return result.toString();
        }

}






