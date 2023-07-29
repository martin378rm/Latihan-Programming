package data;

import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        System.out.println(isValidComplex("{}{}"));
    }

    // bracket test
    public static boolean isValid(String s) {
        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '{') {
                count++;
            } else {
                count--;
            }
        }
        if (count < 0) {
            return false;
        }
        return count == 0;
    }

    public static boolean isValidComplex(String s) {
        var stack = new char[s.length()];
        var top = 0;


        for (var c : s.toCharArray()) {

            switch (c) {

                case '{', '[', '(' -> stack[top++] = c;
                case '}' -> {
                    if (top == 0 || stack[--top] != '{')
                        return false;
                }
                case ']' -> {
                    if (top == 0 || stack[--top] != '[')
                        return false;
                }
                case ')' -> {
                    if (top == 0 || stack[--top] != '(')
                        return false;
                }
            }
        }

        return top == 0;
    }

    public static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();


        // convert string into char array and access the characters using for each loop.
        for(char ch: s.toCharArray())
        {
            // check ch
            switch (ch)
            {
                // open bracket then push it in stack.
                // close bracket then pop the item and compare.
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if(stack.isEmpty() || stack.pop() != '(')

                    // if the stack is empty then it means string have no open bracket.
                    // hence it is invalid.
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                    {
                        return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty() || stack.pop() != '[')
                    {
                        return false;
                    }
                    break;
            }
        }


        // After the loop we have to check one more condition.
        // return true only if the stack is empty.
        // if stack is not empty that means we have unused brackets.

        return stack.isEmpty();
    }
}