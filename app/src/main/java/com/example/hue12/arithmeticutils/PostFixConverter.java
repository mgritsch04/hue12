package com.example.hue12.arithmeticutils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class PostFixConverter {
    private String infix;
    private Deque<Character> stack = new ArrayDeque<>();
    private List<String> postfix = new ArrayList<>();

    public PostFixConverter(String expression) {
        this.infix = expression;
    }

    private void convertExpression() {
        while (stack.size() > 1) {
            Character token = stack.pollFirst();
            boolean isNumber;
            try {
                int tokenNumber = Integer.parseInt(String.valueOf(token));
                postfix.add(String.valueOf(tokenNumber));
                isNumber = true;
            } catch (NumberFormatException e) {
                isNumber = false;
            }
            if (!isNumber) {
                if(token.equals('(')) {
                    
                }
            }

        }
    }

    private void inputToStack(char input) {
        stack.add(input);
    }

    private int getPrecedence(char op) {

    }

    private void clearStack() {
        stack.clear();
    }

    public String getPostfixExpression() {

    }

    public List<String> getPostfixAsList() {
        return postfix;
    }
}
